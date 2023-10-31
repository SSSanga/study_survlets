package com.example.study_survlets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
// servlet인식
@SpringBootApplication
public class StudySurvletsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudySurvletsApplication.class, args);
	}

}
