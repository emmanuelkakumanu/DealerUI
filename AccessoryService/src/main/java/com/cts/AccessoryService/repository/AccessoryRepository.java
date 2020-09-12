package com.cts.AccessoryService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.model.Accessory;

@Repository
public interface AccessoryRepository extends JpaRepository<Accessory, Long> {
	@Query(value = "SELECT * FROM accessories WHERE accessory_id IN (SELECT accessory_id FROM model_accessories WHERE model_id = ?1)", nativeQuery = true)
	public List<Accessory> getAccessoryByModelId(long id);
}
