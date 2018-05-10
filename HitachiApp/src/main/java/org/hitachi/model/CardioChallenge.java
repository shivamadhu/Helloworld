package org.hitachi.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "CARDIO_CHALLENGE")
@Entity
public class CardioChallenge {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cardio_id")
	private Long cardioId;
	@Column(name = "CARDIO_TITLE")
	private String cardioTitle;
	@Column(name = "CARDIO_DESC")
	private String cardioDescription;

	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "cardio_id", referencedColumnName = "cardio_id")
	private List<ChallengeLevel> challengeLevelList;

	public CardioChallenge() {

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

	public List<ChallengeLevel> getChallengeLevelList() {
		return challengeLevelList;
	}

	public void setChallengeLevelList(List<ChallengeLevel> challengeLevelList) {
		this.challengeLevelList = challengeLevelList;
	}

}
