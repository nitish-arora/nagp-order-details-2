package arora.nitish.orderDetails.services.impl;

import static arora.nitish.orderDetails.constant.ApiEndPointConstants.USER_API_PATH;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import arora.nitish.orderDetails.dto.response.UserResponse;
import arora.nitish.orderDetails.services.UserService;
import lombok.extern.slf4j.Slf4j;

/**
 * Service layer to interact with User Service
 * 
 * @author nitish
 *
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

	@Value("${user.service.url}")
	private String baseURL;

	@Autowired
	RestTemplate restTemplate;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserResponse getUserData(Integer userId) {
		String url = baseURL + String.format(USER_API_PATH, userId);
		log.info("getting user details from user api with url: {}", url);
		return restTemplate.getForEntity(url, UserResponse.class).getBody();
	}
}
