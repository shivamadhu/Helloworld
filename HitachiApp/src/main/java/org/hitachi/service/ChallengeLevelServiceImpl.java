package org.hitachi.service;

import java.util.List;

import org.hitachi.dao.ChallengeLevelDao;
import org.hitachi.model.dto.CardioChallengeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@org.springframework.stereotype.Service("challengeLevelService")
@Transactional(propagation = Propagation.SUPPORTS, rollbackFor = Exception.class)
public class ChallengeLevelServiceImpl implements ChallengeLevelService {
	@Autowired
	ChallengeLevelDao challengeLevelDao;

	public List<CardioChallengeDTO> filter(String challengeLevel) {
		// TODO Auto-generated method stub
		return challengeLevelDao.filter(challengeLevel);
	}
}
