package com.cts.ColorService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ColorService.service.ColorService;
import com.cts.model.Color;

@RestController
@RequestMapping("/colors")
public class ColorController {
	@Autowired
	private ColorService colorService;

	@GetMapping("/getcolors/{id}")
	public List<Color> getAllColors(@PathVariable("id") long id) {
		return colorService.getColorsByModelId(id);
	}

}
