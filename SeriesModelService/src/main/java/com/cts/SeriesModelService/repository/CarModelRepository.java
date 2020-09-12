package com.cts.SeriesModelService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.model.CarModels;







@Repository
public interface CarModelRepository extends JpaRepository<CarModels, Long> {
	@Query(value = "SELECT * FROM models", nativeQuery = true)
	public List<CarModels> getAll();

	@Query(value = "select * from models where series_id=?1", nativeQuery = true)
	public List<CarModels> getModelsBySeriesId(long id);

}
