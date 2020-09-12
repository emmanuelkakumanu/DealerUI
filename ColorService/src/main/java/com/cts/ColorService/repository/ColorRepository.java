package com.cts.ColorService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.model.Color;

@Repository
public interface ColorRepository extends JpaRepository<Color, Long> {
	@Query(value = "select * from colors where color_id IN(select color_id from model_colors where model_id=?1)", nativeQuery = true)
	public List<Color> getColorsByModelId(long id);

}
