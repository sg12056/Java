package main.restController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import main.restResources.EmployeeVO;

@Controller
@RequestMapping("/")
@SessionAttributes("employee")
public class EmployeeController
{
    // @Autowired
    // EmployeeManager manager;
     
    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(Model model)
    {
         EmployeeVO employeeVO = new EmployeeVO();
         model.addAttribute("employee", employeeVO);
         model.addAttribute("msg", "Hello");
         return "resources/addEmployee";
    }
     
    @RequestMapping(method = RequestMethod.POST)
    public String submitForm(@ModelAttribute("employee") EmployeeVO employeeVO,
                            BindingResult result, SessionStatus status)
    {
        //Store the employee information in database
        //manager.createNewRecord(employeeVO);
         System.out.println(employeeVO.getfirstName());
        //Mark Session Complete
        status.setComplete();
        return "redirect:success";
    }
     
    @RequestMapping(value = "/success", method = RequestMethod.GET)
    public String success(Model model)
    {
         return "resources/addSuccess";
    }
}