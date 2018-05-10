package org.hitachi.controller;

import java.util.List;

import org.hitachi.model.CardioChallenge;
import org.hitachi.model.dto.DTO;
import org.hitachi.service.CardioChallengeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardioController {
	@Autowired
	CardioChallengeService cardioChallengeService;

	@Autowired
	DTO dto;

	@RequestMapping(value = "/filter/{filterCardio}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<CardioChallenge> filter(@PathVariable("filterCardio") String filterCardio) {
		dto.setCardioList(cardioChallengeService.filter(filterCardio));
		return dto.getCardioList();
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<CardioChallenge> test() {
		dto.setCardioList(cardioChallengeService.getAll());
		return dto.getCardioList();
	}
}
