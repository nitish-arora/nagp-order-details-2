package arora.nitish.orderDetails.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arora.nitish.orderDetails.dto.response.OrderDetailResponse;
import arora.nitish.orderDetails.services.OrderDetailService;

@RestController
@RequestMapping(value = "/orderDetails")
public class OrderDetailController {

	@Resource
	OrderDetailService orderDetailService;

	@GetMapping(value = "/{userId}")
	public OrderDetailResponse getOrderDetails(@PathVariable("userId") Integer userId) {
		return orderDetailService.getOrderDetails(userId);
	}
}
