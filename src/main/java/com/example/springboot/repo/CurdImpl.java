package com.example.springboot.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.Entity.User;

@Repository
public interface CurdImpl extends CrudRepository<User, Integer> {
	List<String> finduserbyjobtype(String jobtype);
}
