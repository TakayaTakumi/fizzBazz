package com.example.demo.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.imple.FizzBazzService;

@Controller
public class fizzBazzController {

	@Autowired
	FizzBazzService fizzBazzservice;

	ModelMapper modelMapper;

	@GetMapping("/Home")
	public String getFizzBazzHome() {
		return "Home";
	}

	@PostMapping("/Home")
	public String postFizzBazzHome(@RequestParam("text1") int fizz, Model model) {
		List<Integer> resultNumbers = fizzBazzservice.intvalue(fizz);
		List<String> fizzBazzList = fizzBazzservice.fizzBazzResult(fizz);
		model.addAttribute("resultNumbers", resultNumbers);
		model.addAttribute("fizzBazzList", fizzBazzList);

		return "fizzBazz";
	}

}
