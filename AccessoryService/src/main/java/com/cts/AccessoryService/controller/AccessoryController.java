package com.cts.AccessoryService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.AccessoryService.service.AccessoryService;
import com.cts.model.Accessory;

@RestController

@RequestMapping("/accessories")
public class AccessoryController {
	@Autowired
	private AccessoryService accessoryService;

	@GetMapping("/getaccessory/{id}")
	public List<Accessory> getAccessoriesByModelId(@PathVariable("id") Long id) {
		return accessoryService.getAccessoryByModelId(id);
	}

}
