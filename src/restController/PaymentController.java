package restController;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import restResources.BaseResponse;
import restResources.PaymentRequest;

@RestController
//@RequestMapping("/payment")
public class PaymentController {

	private final String sharedKey = "Key";
	//private final String User = "user";
	//private final String Pass = "password";
	private static final String SUCCESS_STATUS = "success";
	private static final String ERROR_STATUS = "error";
	private static final int CODE_SUCCESS = 100;
	private static final int AUTH_FAILURE = 102;

	@RequestMapping(value = "/pay", method = RequestMethod.GET)
	public ModelAndView pay() {
		System.out.println("Pay");
		ModelAndView response = new ModelAndView();
		response.setViewName("resources/pay");
		return response;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public BaseResponse welcome( ) {
		System.out.println("welcome");
		BaseResponse response = new BaseResponse();
		response.setMessage("Spring Frame Works!!");
		return response;
	 }
	// @RequestMapping(value = "/login", method = RequestMethod.POST)
	// public ModelAndView login( ) {
	// 	System.out.println("login");
	// 	ModelAndView response = new ModelAndView();
	// 	response.setViewName("login");
	// 	return response;
	// }

}