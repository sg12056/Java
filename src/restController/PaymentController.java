package restController;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import restResources.BaseResponse;
import restResources.PaymentRequest;

@RestController
//@RequestMapping("/payment")
public class PaymentController {

	private final String sharedKey = "Key";
	private final String User = "user";
	private final String Pass = "password";
	private static final String SUCCESS_STATUS = "success";
	private static final String ERROR_STATUS = "error";
	private static final int CODE_SUCCESS = 100;
	private static final int AUTH_FAILURE = 102;

	@RequestMapping(value = "/pay", method = RequestMethod.POST)
	public BaseResponse pay(@RequestParam(value = "key") String key, @RequestBody PaymentRequest request) {
		System.out.println("PaymentController");
		BaseResponse response = new BaseResponse();
		if (sharedKey.equalsIgnoreCase(key)) {

			// Process the request
			// ....
			// Return success response to the client.

			response.setStatus(SUCCESS_STATUS);
			response.setCode(CODE_SUCCESS);
		} else {
			response.setStatus(ERROR_STATUS);
			response.setCode(AUTH_FAILURE);
		}
		return response;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public BaseResponse login( @RequestBody PaymentRequest request) {
		System.out.println("PaymentController");
		BaseResponse response = new BaseResponse();
		String user = request.getUser();
		String pass = request.getPass();
		if (User.equalsIgnoreCase(user) && Pass.equalsIgnoreCase(pass)) {

			// Process the request
			// ....
			// Return success response to the client.
			response.setMessage("Logged In");
			response.setStatus(SUCCESS_STATUS);
			response.setCode(CODE_SUCCESS);
		} else {
			response.setStatus(ERROR_STATUS);
			response.setCode(AUTH_FAILURE);
			response.setMessage("Invalid UserName/Password");
		}
		return response;
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public BaseResponse welcome( ) {
		System.out.println("PaymentController");
		BaseResponse response = new BaseResponse();
		response.setMessage("Spring Frame Works!!");
		return response;
	}

}