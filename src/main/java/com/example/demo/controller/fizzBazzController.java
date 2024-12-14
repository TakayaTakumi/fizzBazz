package com.example.demo.controller;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.FizzBazzService;

@Controller
public class fizzBazzController {

	FizzBazzService service;

	ModelMapper modelMapper;

	@GetMapping("/Home")
	public String getFizzBazzHome() {
		return "Home";
	}

	@PostMapping("/Home")
	public String postFizzBazzHome(@RequestParam("text1") int fizz, Model model) {
		System.out.println(fizz);

		//		List<String> fizzBazzList = service.intvalue(fizz);
		model.addAttribute("initialValue", service.intvalue(fizz));

		return "fizzBazz";
	}

}
