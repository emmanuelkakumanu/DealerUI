package com.cts.SeriesModelService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.SeriesModelService.repository.CarSeriesRepository;
import com.cts.model.CarSeries;

@Service
public class CarSeriesService {
	@Autowired
	private CarSeriesRepository carSeriesRepository;

	public List<CarSeries> getAllSeries() {
		return carSeriesRepository.findAll();
	}

}
