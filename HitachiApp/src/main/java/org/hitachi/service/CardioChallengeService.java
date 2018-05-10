package org.hitachi.service;

import java.util.List;

import org.hitachi.model.CardioChallenge;

public interface CardioChallengeService {

	public List<CardioChallenge> filter(String filterCardio);

	public List<CardioChallenge> getAll();

}
