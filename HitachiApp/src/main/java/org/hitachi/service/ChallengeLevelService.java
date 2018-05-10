package org.hitachi.service;

import java.util.List;

import org.hitachi.model.dto.CardioChallengeDTO;

public interface ChallengeLevelService {

	public List<CardioChallengeDTO> filter(String filterCardio);
}
