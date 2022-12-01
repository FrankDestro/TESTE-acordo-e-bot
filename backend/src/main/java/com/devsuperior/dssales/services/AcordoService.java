package com.devsuperior.dssales.services;

import ch.qos.logback.classic.Level;
import com.devsuperior.dssales.dto.AcordoSummaryDTO;
import com.devsuperior.dssales.entities.Bot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dssales.repositories.AcordoRepository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Service
public class AcordoService {

	@Autowired
	private AcordoRepository repository;

	@Transactional(readOnly = true)
	public AcordoSummaryDTO AcordoSummary(String minDate, String maxDate) {
		LocalDate min = "".equals(minDate) ? null : LocalDate.parse(minDate);
		LocalDate max = "".equals(maxDate) ? null : LocalDate.parse(maxDate);
		return repository.AcordoSummary(min, max);


	}
}
