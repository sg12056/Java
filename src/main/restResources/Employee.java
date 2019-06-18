package main.restResources;

public class Employee{
    private String name;
    private int age;
    private String dob;
    private String dept;
    private String manager;

    public Employee() {
    }

    public Employee(String name, int age, String dob, String dept, String manager) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.dept = dept;
        this.manager = manager;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDept() {
        return this.dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getManager() {
        return this.manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Employee name(String name) {
        this.name = name;
        return this;
    }

    public Employee age(int age) {
        this.age = age;
        return this;
    }

    public Employee dob(String dob) {
        this.dob = dob;
        return this;
    }

    public Employee dept(String dept) {
        this.dept = dept;
        return this;
    }

    public Employee manager(String manager) {
        this.manager = manager;
        return this;
    }

    

}