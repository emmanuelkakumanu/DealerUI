package com.cts.SeriesModelService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.SeriesModelService.repository.CarModelRepository;
import com.cts.model.CarModels;


@Service
public class CarModelService {
	@Autowired
	private CarModelRepository carModelRepository;

	public List<CarModels> getAllModels() {
		return carModelRepository.getAll();

	}

	public List<CarModels> getAllModelsBySeriesId(Long id) {
		return carModelRepository.getModelsBySeriesId(id);

	}

}
