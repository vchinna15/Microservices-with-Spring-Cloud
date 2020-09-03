package com.example.payment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class PaymentApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testApp() {
		System.out.println(restTemplate.getForObject("/", String.class));
	}

}
