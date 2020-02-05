package com.itnovarte.api.bellmoi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiBellmoiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiBellmoiApplication.class, args);
	}

	@GetMapping("/test")
	public String getMessage() {
		return "Esto es un mensaje REST, el Api de BellMoi esta respondiendo correctamente!";
	}	
	
}
