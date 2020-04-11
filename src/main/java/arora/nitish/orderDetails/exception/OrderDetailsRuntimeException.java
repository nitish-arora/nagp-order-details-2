package arora.nitish.orderDetails.exception;

import org.springframework.http.HttpStatus;

public class OrderDetailsRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private final int responseCode;

	private final String responseMessage;

	private final HttpStatus status;

	public OrderDetailsRuntimeException(HttpStatus status) {
		super(status.getReasonPhrase());
		this.responseCode = status.value();
		this.responseMessage = status.getReasonPhrase();
		this.status = status;
	}

	public OrderDetailsRuntimeException(String responseMessage) {
		super(responseMessage);
		this.responseCode = HttpStatus.INTERNAL_SERVER_ERROR.value();
		this.responseMessage = responseMessage;
		this.status = HttpStatus.INTERNAL_SERVER_ERROR;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public HttpStatus getStatus() {
		return status;
	}
}
