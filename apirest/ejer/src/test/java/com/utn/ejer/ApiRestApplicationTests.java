package com.utn.ejer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiRestApplicationTests {

	@Test
	void contextLoads() {
	}
	public static void main(String[] args) {
		SpringApplication.run(ApiRestApplication.class, args);
		System.out.println("Funcionando");
	}

}
