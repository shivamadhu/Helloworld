package org.hitachi.model.dto;

public class ChallengeLevelDTO {

	private Long challengeId;

	private String levelType;

	private Long cardioId;

	private String cardioType;

	public ChallengeLevelDTO() {

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

	public ChallengeLevelDTO(Long challengeId, String levelType, Long cardioId, String cardioType) {
		super();
		this.challengeId = challengeId;
		this.levelType = levelType;
		this.cardioId = cardioId;
		this.cardioType = cardioType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardioId == null) ? 0 : cardioId.hashCode());
		result = prime * result + ((cardioType == null) ? 0 : cardioType.hashCode());
		result = prime * result + ((challengeId == null) ? 0 : challengeId.hashCode());
		result = prime * result + ((levelType == null) ? 0 : levelType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChallengeLevelDTO other = (ChallengeLevelDTO) obj;
		if (cardioId == null) {
			if (other.cardioId != null)
				return false;
		} else if (!cardioId.equals(other.cardioId))
			return false;
		if (cardioType == null) {
			if (other.cardioType != null)
				return false;
		} else if (!cardioType.equals(other.cardioType))
			return false;
		if (challengeId == null) {
			if (other.challengeId != null)
				return false;
		} else if (!challengeId.equals(other.challengeId))
			return false;
		if (levelType == null) {
			if (other.levelType != null)
				return false;
		} else if (!levelType.equals(other.levelType))
			return false;
		return true;
	}

}
