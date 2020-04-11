package arora.nitish.orderDetails.services.impl;

import static arora.nitish.orderDetails.constant.ErrorMessages.NO_RECORD_FOUND;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import arora.nitish.orderDetails.dto.response.OrderDetailResponse;
import arora.nitish.orderDetails.dto.response.OrderResponse;
import arora.nitish.orderDetails.dto.response.UserResponse;
import arora.nitish.orderDetails.exception.OrderDetailsRuntimeException;
import arora.nitish.orderDetails.services.OrderDetailService;
import arora.nitish.orderDetails.services.OrderService;
import arora.nitish.orderDetails.services.UserService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OrderDetailServiceImpl implements OrderDetailService {

	private OrderService orderService;

	private UserService userService;

	@Autowired
	public OrderDetailServiceImpl(final OrderService orderService, final UserService userService) {
		this.orderService = orderService;
		this.userService = userService;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OrderDetailResponse getOrderDetails(Integer userId) {
		try {
			log.info("getting user-details with userId: {}", userId);
			UserResponse userResponse = userService.getUserData(userId);
			if (userResponse != null) {
				OrderDetailResponse orderDetailResponse = new OrderDetailResponse();
				orderDetailResponse.setUser(userResponse.getUser());
				log.info("getting order-details with userId: {}", userId);
				OrderResponse orderResponse = orderService.getOrderData(userId);
				orderDetailResponse.setOrders(orderResponse.getOrders());
				return orderDetailResponse;
			} else {
				throw new OrderDetailsRuntimeException(NO_RECORD_FOUND);
			}
		} catch (Exception ex) {
			throw new OrderDetailsRuntimeException(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
