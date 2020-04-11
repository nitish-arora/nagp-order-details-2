package arora.nitish.orderDetails.constant;

public class ApiEndPointConstants {

	public static final String USER_API_PATH = "/user/%s";
	public static final String ORDER_API_PATH = "/order/user/%s";

	private ApiEndPointConstants() throws IllegalAccessException {
		throw new IllegalAccessException("Class can't be instantiated");
	}
}
