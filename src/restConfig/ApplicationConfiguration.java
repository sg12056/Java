package restConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
 
@Configuration
@EnableWebMvc
@ComponentScan({"restController","securityConfig"})
public class ApplicationConfiguration {     
 ApplicationConfiguration() {
	 System.out.println("ApplicationConfiguration");
 }
}