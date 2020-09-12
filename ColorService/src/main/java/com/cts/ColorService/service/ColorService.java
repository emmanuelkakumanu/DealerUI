package com.cts.ColorService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.ColorService.repository.ColorRepository;
import com.cts.model.Color;

@Service
public class ColorService {
	@Autowired
	private ColorRepository colorRepository;
	
	public List<Color> getColorsByModelId(long id) {
		return colorRepository.getColorsByModelId(id);
	}

}
