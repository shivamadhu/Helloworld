package org.hitachi.dao;

import java.util.List;

import org.hitachi.model.dto.CardioChallengeDTO;

public interface ChallengeLevelDao {

	public List<CardioChallengeDTO> filter(String filterCardio);

}
