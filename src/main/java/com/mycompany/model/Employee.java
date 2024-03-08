package com.mycompany.model;

import javax.persistence.*;

@Entity
@Table(name = "divum")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "email")
    private String email;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "dob")
    private String dob;

    @Column(name = "address")
    private String address;


    public Employee() {
        super();
    }

//    public Employee(String firstName, String lastName, String email, String address) {
//        super();
//        this.email = email;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.mobile = mobile;
//        this.dob = dob;
//        this.address = address;
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
