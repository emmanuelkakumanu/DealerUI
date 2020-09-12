package com.cts.SeriesModelService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.SeriesModelService.service.CarModelService;
import com.cts.SeriesModelService.service.CarSeriesService;
import com.cts.model.CarModels;
import com.cts.model.CarSeries;

import io.swagger.annotations.Api;

@Api
@RestController
@RequestMapping("/cars")
public class SeriesModelServiceController {
	@Autowired
	private CarSeriesService carSeriesService;
	@Autowired
	private CarModelService carModelService;

	@GetMapping("/series")
	public List<CarSeries> getAllSeries() {
		return carSeriesService.getAllSeries();
	}

	@GetMapping("/series/models")
	public List<CarModels> getAllModels() {
		return carModelService.getAllModels();
	}

	@GetMapping("/series/{id}/getmodels")
	public List<CarModels> getModelById(@PathVariable("id") Long id) {
		
		return carModelService.getAllModelsBySeriesId(id);
	}
}
