package com.cts.OrderService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.cts.OrderService.DTO.OrderDTO;
import com.cts.OrderService.model.OrderAccessoryDetails;
import com.cts.OrderService.model.OrderColorDetails;
import com.cts.OrderService.model.OrderDetails;
import com.cts.OrderService.repository.OrderAccessoryDetailsRepository;
import com.cts.OrderService.repository.OrderColorDetailsRepository;
import com.cts.OrderService.repository.OrderDetailsRepository;


@Service
public class OrderService {
	@Autowired
	private OrderDetailsRepository orderDetailsRepository;	
	@Autowired
	private OrderColorDetailsRepository orderColorDetailsRepository;
	@Autowired
	private OrderAccessoryDetailsRepository orderAccessoryDetailsRepository;
	
	

	public void placeOrder(@RequestBody OrderDTO orderDTO) {
		OrderDetails od = new OrderDetails();
		od.setUserId(orderDTO.getUserId());
		od.setSeriesId(orderDTO.getSeriesId());
		od.setSeriesName(orderDTO.getSeriesName());
		od.setModelId(orderDTO.getModelId());
		od.setModelName(orderDTO.getModelName());
		od.setTotalPrice(orderDTO.getTotalPrice());
		od.setOrderAccessoryDetails(orderDTO.getAccessoriesSelected());
		od.setOrderColorDetails(orderDTO.getColorsSelected());
		orderDetailsRepository.save(od);
	}

	public List<OrderDTO> getAllOrders() {
		List<OrderDetails> od = orderDetailsRepository.findAll();
		List<OrderColorDetails> ocd = orderColorDetailsRepository.findAll();
		List<OrderAccessoryDetails> oad = orderAccessoryDetailsRepository.findAll();
		ArrayList<OrderDTO> listOrders=new ArrayList<OrderDTO>();
		for(int i=0;i<od.size();i++) {
		OrderDTO sendData = new OrderDTO();		
		sendData.setUserId(od.get(i).getUserId());
		sendData.setSeriesId(od.get(i).getSeriesId());
		sendData.setSeriesName(od.get(i).getSeriesName());
		sendData.setModelId(od.get(i).getModelId());
		sendData.setModelName(od.get(i).getModelName());
		sendData.setTotalPrice(od.get(i).getTotalPrice());
		sendData.setAccessoriesSelected(od.get(i).getOrderAccessoryDetails());
		sendData.setColorsSelected(od.get(i).getOrderColorDetails());
		listOrders.add(sendData);
		}	
		return listOrders;

	}
}
