package org.hitachi.model.dto;

import java.util.List;

import org.hitachi.model.CardioChallenge;

public class DTO {
	private List<CardioChallengeDTO> cardioChallengeList;
	
	private List<CardioChallenge> cardioList;

	public List<CardioChallenge> getCardioList() {
		return cardioList;
	}

	public void setCardioList(List<CardioChallenge> cardioList) {
		this.cardioList = cardioList;
	}

	public List<CardioChallengeDTO> getCardioChallengeList() {
		return cardioChallengeList;
	}

	public void setCardioChallengeList(List<CardioChallengeDTO> cardioChallengeList) {
		this.cardioChallengeList = cardioChallengeList;
	}	
	
}
