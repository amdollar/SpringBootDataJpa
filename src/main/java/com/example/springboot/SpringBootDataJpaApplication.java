package com.example.springboot;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springboot.Entity.User;
import com.example.springboot.Service.UserService;

@SpringBootApplication
public class SpringBootDataJpaApplication {
	private static final Logger logger = Logger.getLogger(SpringBootDataJpaApplication.class.getName());

	public static void main(String[] args) {
		ApplicationContext ct = SpringApplication.run(SpringBootDataJpaApplication.class, args);
		UserService ser = ct.getBean("UserService", UserService.class);
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
