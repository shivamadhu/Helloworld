package org.hitachi.controller;

import java.util.List;

import org.hitachi.model.dto.CardioChallengeDTO;
import org.hitachi.service.ChallengeLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChallengeLevelController {
	@Autowired
	ChallengeLevelService challengeLevelService;

	@RequestMapping(value = "/challengeLevelFilter/{challengeLevel}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<CardioChallengeDTO> filter(@PathVariable("challengeLevel") String challengeLevel) {

		return challengeLevelService.filter(challengeLevel);
	}

}
