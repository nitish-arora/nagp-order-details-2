package arora.nitish.orderDetails.services;

import arora.nitish.orderDetails.dto.response.OrderDetailResponse;

public interface OrderDetailService {

	/**
	 * function to get user details and order details specific to userId
	 * 
	 * @param userId - user id
	 * @return
	 */
	public OrderDetailResponse getOrderDetails(Integer userId);
}
