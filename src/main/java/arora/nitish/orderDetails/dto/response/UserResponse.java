package arora.nitish.orderDetails.dto.response;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import arora.nitish.orderDetails.entities.User;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserResponse extends BaseResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private User user;

	public UserResponse() {
	}

	public UserResponse(HttpStatus status) {
		super(status);
	}

	public UserResponse(HttpStatus status, String message) {
		super(status, message);
	}

	public UserResponse(HttpStatus status, User user) {
		super(status);
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
