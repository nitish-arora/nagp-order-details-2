package arora.nitish.orderDetails.services;

import arora.nitish.orderDetails.dto.response.UserResponse;

public interface UserService {

	/**
	 * function to get details of user with specific user id
	 * 
	 * @param userId - user id to get the details of user
	 */
	public UserResponse getUserData(Integer userId);
}
