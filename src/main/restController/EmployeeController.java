package main.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import main.restResources.EmployeeVO;
import main.restResources.Person;
import main.restResources.PersonServiceImpl;

@Controller
@RequestMapping("/")
@SessionAttributes("employee")
@Service("empService")
public class EmployeeController
{
    @Autowired
    PersonServiceImpl personService;
    
    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(Model model)
    {
         Person employeeVO = new Person();
         model.addAttribute("employee", employeeVO);
         model.addAttribute("msg", "Hello");
         return "resources/addEmployee";
    }
     
    @RequestMapping(method = RequestMethod.POST)
    public String submitForm(@ModelAttribute("employee") Person employeeVO,
                            BindingResult result, SessionStatus status)
    {
        //Store the employee information in database
        personService.addPerson(employeeVO);
        
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