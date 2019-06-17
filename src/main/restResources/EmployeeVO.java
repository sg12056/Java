package main.restResources;

import java.io.Serializable;
 
public class EmployeeVO implements Serializable
{
    private static final long serialVersionUID = 1L;
 
    private Integer id;
    private String firstName = "Saurabh";
    private String lastName;
    private String email;
 
    //Getters and Setters
    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return this.id;
    }

    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    public String getfirstName(){
        return this.firstName;
    }
    
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    public String getlastName(){
        return this.lastName;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    public String getemail(){
        return this.email;
    }
    
    @Override
    public String toString() {
        return "EmployeeVO [id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + ", email=" + email + "]";
    }
}