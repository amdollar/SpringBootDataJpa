package com.example.springboot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.Entity.User;
import com.example.springboot.repo.CurdImpl;
import com.example.springboot.repo.UserRepository;

@Service(value = "UserService")
public class UserService {
	@Autowired
	UserRepository repo;

	@Autowired
	CurdImpl crudrepo;

	public List<User> allUsers() {
		return repo.findAll();
	}

	public List<User> findByAgeLessThan(int age) {
		return repo.findByAgeLessThan(age);
	}

	public List<String> findUserbyJobtype(String jobtype) {
		return repo.finduserbyjobtype(jobtype);
	}

}
