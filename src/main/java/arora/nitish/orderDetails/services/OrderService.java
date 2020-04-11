package arora.nitish.orderDetails.services;

import arora.nitish.orderDetails.dto.response.OrderResponse;

public interface OrderService {

	/**
	 * function to get details of all order with specific user id
	 * 
	 * @param userId - user id mapped to order
	 */
	public OrderResponse getOrderData(Integer userId);
}
