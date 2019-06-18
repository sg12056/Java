package main.restController;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jdbcController {
   
    @RequestMapping("/query")
    private int query(){
        
        // JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
        // int row = jdbcTemplate.queryForObject("Select count(*) from localdb.employee"
        // ,Integer.class);
         return 0;
    }
    
}