package com.example.enquiry_management.repository;

import com.example.enquiry_management.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public interface UsersRepository extends JpaRepository<Users,String> {

   // List<Users> findByUsername(String username);
    //List<Users> findByContact(String contact);
    //List<Users> findByGender(String gender);
   List<Users> findAll();





}
