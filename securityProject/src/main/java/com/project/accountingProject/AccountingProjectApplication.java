package com.project.accountingProject;

import com.project.accountingProject.model.entity.Role;
import com.project.accountingProject.model.entity.User;
import com.project.accountingProject.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;

@SpringBootApplication
public class AccountingProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountingProjectApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(UserService userService){
		return args -> {
			userService.save(Role.builder().name("ROLE_USER").build());
			userService.save(Role.builder().name("ROLE_ADMIN").build());


			userService.save(User.builder().name("john").username("idoe").password("1234").roles(new HashSet<>()).build());

			userService.addRoleToUser("idoe", "ROLE_USER");
		};
	}

}
