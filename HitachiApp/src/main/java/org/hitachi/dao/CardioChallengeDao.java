package org.hitachi.dao;

import java.util.List;

import org.hitachi.model.CardioChallenge;

public interface CardioChallengeDao {

	public List<CardioChallenge> filter(String filterCardio);

	public List<CardioChallenge> getAll();
}
