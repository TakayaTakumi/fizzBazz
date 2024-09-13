package com.example.demo.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.form.FizzBazzForm;
import com.example.demo.service.FizzBazzService;

@Controller
public class fizzBazzController {

	@Autowired
	FizzBazzService fizzBazzService;

	@Autowired
	ModelMapper modelMapper;

	@GetMapping("/Home")
	public String getFizzBazzHome(@ModelAttribute FizzBazzForm form, Model model) {
		List<Integer> getpastData = fizzBazzService.getPastData();

		model.addAttribute("getpastData", getpastData);

		return "Home";
	}

	@PostMapping("/Home")
	public String postFizzBazzHome(@RequestParam("fizz") int fizz, Model model,
			@ModelAttribute @Validated FizzBazzForm form,
			BindingResult baindingResult) {
		if (baindingResult.hasErrors()) {
			return getFizzBazzHome(form, model);
		}
		List<Integer> resultNumbers = fizzBazzService.intvalue(fizz);
		List<String> fizzBazzList = fizzBazzService.fizzBazzResult(fizz);

		model.addAttribute("resultNumbers", resultNumbers);
		model.addAttribute("fizzBazzList", fizzBazzList);

		return "fizzBazz";
	}

}
