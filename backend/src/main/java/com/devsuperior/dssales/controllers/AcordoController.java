package com.devsuperior.dssales.controllers;

import com.devsuperior.dssales.dto.AcordoSummaryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dssales.services.AcordoService;

@RestController
@RequestMapping(value = "/acordo")
public class AcordoController {

	@Autowired
	private AcordoService service;

	@GetMapping(value = "/summary")
	public ResponseEntity<AcordoSummaryDTO> AcordoSummary(
			@RequestParam(value = "minDate", defaultValue = "") String minDate,
			@RequestParam(value = "maxDate", defaultValue = "") String maxDate,
			@RequestParam(value = "bot", defaultValue = "") String bot) {
		AcordoSummaryDTO obj = service.AcordoSummary(minDate, maxDate);
		return ResponseEntity.ok(obj);
	}

}


