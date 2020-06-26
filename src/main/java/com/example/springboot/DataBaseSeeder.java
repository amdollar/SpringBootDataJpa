package com.example.springboot;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springboot.Entity.User;
import com.example.springboot.repo.UserRepository;

@Component
public class DataBaseSeeder implements CommandLineRunner {
	@Autowired
	UserRepository repo;
	public static final Logger logger = Logger.getLogger(DataBaseSeeder.class.getName());

	public void run(String... args) throws Exception {
		repo.deleteAll();
		User us2 = new User( "Akshita", 21, "Temp");
		User us3 = new User( "Ankita", 21, "Temp");
		User us4 = new User( "Rahul", 25, "Temp");
		User us5 = new User( "Devendra", 28, "Permanent");
		repo.save(us2);
		repo.save(us3);
		repo.save(us4);
		repo.save(us5);
		logger.info("Data Seeded..");
	}

}
