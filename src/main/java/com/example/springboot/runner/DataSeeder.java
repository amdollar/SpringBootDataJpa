package com.example.springboot.runner;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springboot.SpringBootDataJpaApplication;
import com.example.springboot.Entity.User;
import com.example.springboot.Service.UserService;

@Component
public class DataSeeder implements CommandLineRunner {
	private static final Logger logger = Logger.getLogger(SpringBootDataJpaApplication.class.getName());

	@Autowired
	UserService ser;

	public void run(String... args) throws Exception {
//		UserService ser = ct.getBean("UserService", UserService.class);
		List<User> users = ser.allUsers();
		logger.info("All Users :::");
		for (User user : users) {
			logger.info(user.getName());
		}
		logger.info("Age Users :::");
		List<User> agesUsers = ser.findByAgeLessThan(23);
		for (User user : agesUsers) {
			logger.info(user.getName());
		}

		logger.info("JobType Users :::");
		List<String> jobtype = ser.findUserbyJobtype("Permanent");
		for (String user : jobtype) {
			logger.info(user);
		}
	}

}
