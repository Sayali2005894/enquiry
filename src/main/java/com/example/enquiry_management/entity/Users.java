package com.example.enquiry_management.entity;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq")
    @SequenceGenerator(name = "recruiter_users_seq", sequenceName = "USERS_SEQ", allocationSize = 1)


//declration
public String user_id;
    public  String username;
    public  String contact;
    public  String gender;

    //Getters and Setters------------------------------------------------------------
//getter(return value)-----------------------------------------------------
 public String getUser_id()
 {
     return user_id;
 }
 //setter(only set not return value (parametrized)------------------------------
public void setUser_id(String User_id)
{
    this.user_id=user_id;
}
//---------------------------------------------------------------------------------------------

    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username=username;
    }
    public String getContact()
    {
        return contact;
    }
    public void setContact(String contact)
    {
        this.contact=contact;
    }
    public String getGender()
    {
        return contact;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}


