package com.example.enquiry_management.service;

import com.example.enquiry_management.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    //_______________________repository_inject_____________________________
@Autowired
    public UsersRepository usersRepository;
 public UserService(UsersRepository usersRepository)
 {
     this.usersRepository=usersRepository;
 }
 //____________________________________________________________________________
}
