package securityConfig;

//@EnableWebSecurity
//@Configuration
public class SecurityJavaConfig {//extends WebSecurityConfigurerAdapter {
 
	SecurityJavaConfig(){
		System.out.println("SecurityJavaConfig");
	}
	
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) 
//      throws Exception {
//    	System.out.println("configureGlobal");
//    	auth.inMemoryAuthentication()
//        .withUser("user").password("password").roles("USER")
//        .and()
//        .withUser("admin").password("password").roles("USER", "ADMIN");
//    	
//    	auth.inMemoryAuthentication().withUser("user")
//        .password("password").roles("USER");
//    }
      
//    protected void configure(HttpSecurity http) throws Exception {
//    	System.out.println("configure");
//    	http.authorizeRequests()
//        .anyRequest().authenticated()
//        .and().httpBasic();
//    	
//        http.authorizeRequests()
//          .anyRequest().authenticated()
//          .and().formLogin()
//          .loginPage("/login").permitAll();
//        
//        http.authorizeRequests()
//        .antMatchers("/", "/home").access("hasRole('USER')")
//        .antMatchers("/admin/**").hasRole("ADMIN")
//        .and()
//        // some more method calls
//        .formLogin();
//        
//        http.logout();
//        // some other method calls
//    }
    
    
}
//
//import org.springframework.context.annotation.Configuration;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.context.annotation.*;
//import org.springframework.security.config.annotation.authentication.builders.*;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.*;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.AuthenticationEntryPoint;
//import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
//import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
//import org.springframework.security.web.savedrequest.RequestCache;
//import org.springframework.security.web.savedrequest.SavedRequest;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//
//@Configuration
//@EnableWebSecurity
//@ComponentScan(basePackages = "securityConfig")
//public class SecurityJavaConfig extends WebSecurityConfigurerAdapter{
// 
//    
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		System.out.println("configure");
//	    auth.inMemoryAuthentication()
//	        .withUser("admin").password(encoder().encode("adminPass")).roles("ADMIN")
//	        .and()
//	        .withUser("user").password(encoder().encode("userPass")).roles("USER");
//	}
//	 
//	@Bean
//	public PasswordEncoder  encoder() {
//		System.out.println("PasswordEncoder");
//	    return new BCryptPasswordEncoder();
//	}
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception { 
//		System.out.println("configureHTTP");
//	    http
//	    .csrf().disable()
//	    .exceptionHandling()
//	    .authenticationEntryPoint(new RestAuthenticationEntryPoint())
//	    .and()
//	    .authorizeRequests()
//	    .antMatchers("/api/foos").authenticated()
//	    .antMatchers("/api/admin/**").hasRole("ADMIN")
//	    .and()
//	    .formLogin()
//	    .successHandler(new AuthenticationSuccessHandler())
//	    .failureHandler(null)
//	    .and()
//	    .logout();
//	}
//	
//	@Component
//	public final class RestAuthenticationEntryPoint 
//	  implements AuthenticationEntryPoint {
//	 
//	    @Override
//	    public void commence(
//	        HttpServletRequest request, 
//	        HttpServletResponse response, 
//	        AuthenticationException authException) throws IOException {
//	    	System.out.println("commence");
//	        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, 
//	          "Unauthorized");
//	    }
//
//		
//	}
//	
//	@Component
//	public class AuthenticationSuccessHandler 
//	  extends SimpleUrlAuthenticationSuccessHandler {
//	 
//	    private RequestCache requestCache = new HttpSessionRequestCache();
//	 
//	    @Override
//	    public void onAuthenticationSuccess(
//	      HttpServletRequest request,
//	      HttpServletResponse response, 
//	      Authentication authentication) 
//	      throws ServletException, IOException {
//	    	System.out.println("onAuthenticationSuccess");
//	        SavedRequest savedRequest
//	          = requestCache.getRequest(request, response);
//	 
//	        if (savedRequest == null) {
//	            clearAuthenticationAttributes(request);
//	            return;
//	        }
//	        String targetUrlParam = getTargetUrlParameter();
//	        if (isAlwaysUseDefaultTargetUrl()
//	          || (targetUrlParam != null
//	          && StringUtils.hasText(request.getParameter(targetUrlParam)))) {
//	            requestCache.removeRequest(request, response);
//	            clearAuthenticationAttributes(request);
//	            return;
//	        }
//	 
//	        clearAuthenticationAttributes(request);
//	    }
//	 
//	    public void setRequestCache(RequestCache requestCache) {
//	        this.requestCache = requestCache;
//	    }
//	}
//}