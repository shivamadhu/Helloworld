package org.hitachi.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hitachi.model.CardioChallenge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("cardioChallengeImpl")
public class CardioChallengeImpl implements CardioChallengeDao {
	@Autowired
	SessionFactory sessionFactory;

	protected Session currentSession() {
		return sessionFactory.getCurrentSession();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CardioChallenge> filter(String filterCardio) {
		return currentSession().createQuery("from CardioChallenge where CARDIO_TITLE like (\'%" + filterCardio + "%\')")
				.list();
	}

	@Override
	public List<CardioChallenge> getAll() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<CardioChallenge> list = currentSession()
				.createQuery("select c from CardioChallenge c,ChallengeLevel l " + "where c.cardioId=l.cardioId")
				.list();
		Set<CardioChallenge> hs = new HashSet<CardioChallenge>();
		hs.addAll(list);
		list.clear();
		list.addAll(hs);

		return list;
	}

}
