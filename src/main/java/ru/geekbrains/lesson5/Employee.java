package ru.geekbrains.lesson5;

import javax.xml.namespace.QName;
import java.security.PrivateKey;

public class Employee {
    private String firstName;
    private String secondName;
    private String email;
    private String maritalStatus;
    private int age;
    public Employee (String firstName,String secondName ,String email, String maritalStatus,int age){
        this.firstName= firstName;
        this.firstName= secondName;
        this.email=email;
        this.maritalStatus=maritalStatus;
        this.age=age;
    }
    public void information(){
        System.out.println(firstName + " " + secondName + " " + email + " " + maritalStatus + " " + age);
    }
    public int getAge(){
        return age;
    }
}
