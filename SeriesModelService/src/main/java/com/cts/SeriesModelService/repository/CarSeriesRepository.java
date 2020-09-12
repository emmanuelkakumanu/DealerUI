package com.cts.SeriesModelService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.model.CarSeries;

@Repository
public interface CarSeriesRepository extends JpaRepository<CarSeries, Long> {
	@Query(value = "select * from series", nativeQuery = true)

	public List<CarSeries> getAll();

}
