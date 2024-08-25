package com.example.demo.form;

import org.hibernate.validator.constraints.Range;

import lombok.Data;


@Data
public class FizzBazzForm {

	@Range(min = 1, max = 100)
	int fizz;

	int bazz;

	int fizzBazz;

	String name;

}
