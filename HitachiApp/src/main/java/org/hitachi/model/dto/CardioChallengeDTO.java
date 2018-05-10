package org.hitachi.model.dto;

import java.util.List;

public class CardioChallengeDTO {

	private Long cardioId;

	private String cardioTitle;

	private String cardioDescription;

	private List<ChallengeLevelDTO> challengeLevelList;

	public CardioChallengeDTO() {

	}

	public Long getCardioId() {
		return cardioId;
	}

	public void setCardioId(Long cardioId) {
		this.cardioId = cardioId;
	}

	public String getCardioTitle() {
		return cardioTitle;
	}

	public void setCardioTitle(String cardioTitle) {
		this.cardioTitle = cardioTitle;
	}

	public String getCardioDescription() {
		return cardioDescription;
	}

	public void setCardioDescription(String cardioDescription) {
		this.cardioDescription = cardioDescription;
	}

	public List<ChallengeLevelDTO> getChallengeLevelList() {
		return challengeLevelList;
	}

	public void setChallengeLevelList(List<ChallengeLevelDTO> challengeLevelList) {
		this.challengeLevelList = challengeLevelList;
	}

	public CardioChallengeDTO(Long cardioId, String cardioTitle, String cardioDescription,
			List<ChallengeLevelDTO> challengeLevelList) {
		super();
		this.cardioId = cardioId;
		this.cardioTitle = cardioTitle;
		this.cardioDescription = cardioDescription;
		this.challengeLevelList = challengeLevelList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardioDescription == null) ? 0 : cardioDescription.hashCode());
		result = prime * result + ((cardioId == null) ? 0 : cardioId.hashCode());
		result = prime * result + ((cardioTitle == null) ? 0 : cardioTitle.hashCode());
		result = prime * result + ((challengeLevelList == null) ? 0 : challengeLevelList.hashCode());
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
		CardioChallengeDTO other = (CardioChallengeDTO) obj;
		if (cardioDescription == null) {
			if (other.cardioDescription != null)
				return false;
		} else if (!cardioDescription.equals(other.cardioDescription))
			return false;
		if (cardioId == null) {
			if (other.cardioId != null)
				return false;
		} else if (!cardioId.equals(other.cardioId))
			return false;
		if (cardioTitle == null) {
			if (other.cardioTitle != null)
				return false;
		} else if (!cardioTitle.equals(other.cardioTitle))
			return false;
		if (challengeLevelList == null) {
			if (other.challengeLevelList != null)
				return false;
		} else if (!challengeLevelList.equals(other.challengeLevelList))
			return false;
		return true;
	}

}
