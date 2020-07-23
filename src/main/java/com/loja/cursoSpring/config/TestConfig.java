package com.loja.cursoSpring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.loja.cursoSpring.entities.User;
import com.loja.cursoSpring.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		User u3 = new User(null, "erick", "erick@gmail.com", "9999999", "123456");
		User u4 = new User(null, "luiz", "luiz@gmail.com", "0000000", "123456");
		User u5 = new User(null, "lisboa", "lisboa@gmail.com", "11111111", "123456");

		userRepository.saveAll(Arrays.asList(u1,u2,u3,u4,u5));
		
	}
}
