package com.example.springboot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findByAgeLessThan(int age);

	List<String> finduserbyjobtype(String jobtype);
}
