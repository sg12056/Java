package main.restController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import main.restResources.BaseResponse;

@RestController
public class PaymentController {

	@RequestMapping(value = "/pay", method = RequestMethod.GET)
	public ModelAndView pay() {
		System.out.println("Pay");
		ModelAndView response = new ModelAndView();
		BaseResponse bs = new BaseResponse();
		bs.setCode(200);bs.setMessage("Paid");bs.setStatus("Success!!");
		response.setViewName("resources/pay");
		response.addObject("response", bs);
		//response.addObject(attributeName, attributeValue);
		return response;
	}
	
	// @RequestMapping(value = "/", method = RequestMethod.GET)
	// public BaseResponse welcome( ) {
	// 	System.out.println("welcome");
	// 	BaseResponse response = new BaseResponse();
	// 	response.setMessage("Spring Frame Works!!");
	// 	return response;
	//  }
	

}