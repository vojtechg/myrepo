package com.example.MyFirstApp3.Repository;

import com.example.MyFirstApp3.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Integer> {


}
