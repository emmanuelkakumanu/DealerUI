package com.cts.AccessoryService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.AccessoryService.repository.AccessoryRepository;
import com.cts.model.Accessory;

@Service
public class AccessoryService {
	@Autowired
	private AccessoryRepository accessoryRepository;

	public List<Accessory> getAccessoryByModelId(Long id) {
		return accessoryRepository.getAccessoryByModelId(id);
	}

}
