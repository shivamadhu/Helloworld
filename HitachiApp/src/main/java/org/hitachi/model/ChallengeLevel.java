package org.hitachi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "CHALLENGE_LEVEL")
@Entity
public class ChallengeLevel {
	@Column(name = "CH_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long challengeId;

	@Column(name = "CH_LEVEL")
	private String levelType;

	@Column(name = "cardio_id")
	private Long cardioId;

	@Column(name = "CARDIO_TYPE")
	private String cardioType;

	public ChallengeLevel() {

	}

	public Long getChallengeId() {
		return challengeId;
	}

	public void setChallengeId(Long challengeId) {
		this.challengeId = challengeId;
	}

	public String getLevelType() {
		return levelType;
	}

	public void setLevelType(String levelType) {
		this.levelType = levelType;
	}

	public Long getCardioId() {
		return cardioId;
	}

	public void setCardioId(Long cardioId) {
		this.cardioId = cardioId;
	}

	public String getCardioType() {
		return cardioType;
	}

	public void setCardioType(String cardioType) {
		this.cardioType = cardioType;
	}
}
