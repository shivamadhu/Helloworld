package org.hitachi.service;

import java.util.List;

import org.hitachi.dao.CardioChallengeDao;
import org.hitachi.model.CardioChallenge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@org.springframework.stereotype.Service("cardioChallengeService")
@Transactional(propagation = Propagation.SUPPORTS, rollbackFor = Exception.class)
public class CardioChallengeImpl implements CardioChallengeService {
	@Autowired
	CardioChallengeDao cardioChallengeDao;

	@Override
	public List<CardioChallenge> filter(String filterCardio) {
		// TODO Auto-generated method stub
		return cardioChallengeDao.filter(filterCardio);
	}

	@Override
	public List<CardioChallenge> getAll() {
		// TODO Auto-generated method stub
		return cardioChallengeDao.getAll();
	}
}
