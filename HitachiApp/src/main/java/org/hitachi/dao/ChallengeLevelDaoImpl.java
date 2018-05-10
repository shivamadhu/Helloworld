package org.hitachi.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hitachi.model.CardioChallenge;
import org.hitachi.model.ChallengeLevel;
import org.hitachi.model.dto.CardioChallengeDTO;
import org.hitachi.model.dto.ChallengeLevelDTO;
import org.hitachi.model.dto.DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("challengeLevelDao")
public class ChallengeLevelDaoImpl implements ChallengeLevelDao {
	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	DTO dto;

	protected Session currentSession() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public List<CardioChallengeDTO> filter(String challengeLevel) {
		List<CardioChallenge> list = null;
		if (dto.getCardioList() == null)
			list = currentSession().createQuery("select c from CardioChallenge c,ChallengeLevel l "
					+ "where l.levelType = \'" + challengeLevel + "\'" + " and c.cardioId=l.cardioId").list();
		else
			list = dto.getCardioList();

		List<CardioChallengeDTO> newList = new ArrayList<CardioChallengeDTO>();
		for (int i = 0; i < list.size(); i++) {
			CardioChallenge cardio = list.get(i);
			CardioChallengeDTO dto = handleData(cardio, challengeLevel);
			newList.add(dto);
		}

		return newList;
	}

	private CardioChallengeDTO handleData(CardioChallenge model, String challengeLevel) {
		CardioChallengeDTO dto = new CardioChallengeDTO();
		dto.setCardioDescription(model.getCardioDescription());
		dto.setCardioId(model.getCardioId());
		dto.setCardioTitle(model.getCardioTitle());

		List<ChallengeLevelDTO> filteredChallengeList = new ArrayList<ChallengeLevelDTO>();
		for (ChallengeLevel challenge : model.getChallengeLevelList()) {
			if (challenge.getLevelType().equals(challengeLevel)) {
				ChallengeLevelDTO challengeDto = new ChallengeLevelDTO();

				challengeDto.setCardioId(challenge.getCardioId());
				challengeDto.setCardioType(challenge.getCardioType());
				challengeDto.setChallengeId(challenge.getChallengeId());
				challengeDto.setLevelType(challenge.getLevelType());
				filteredChallengeList.add(challengeDto);
			}
		}
		if (filteredChallengeList != null)
			dto.setChallengeLevelList(filteredChallengeList);

		return dto;
	}
}
