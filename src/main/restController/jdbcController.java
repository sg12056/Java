package main.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Service("jdbcService")
public class jdbcController {
    
	@Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/query")
    public String query(){
    
         int row = jdbcTemplate.queryForObject("Select count(*) from employee"
         ,int.class);
        
         return "" + row;
    }
    
}