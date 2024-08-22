package com.example.demo.service.imple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.form.FizzBazzForm;

@Service
public abstract class serviceImple implements Service {

	FizzBazzForm fizzBazzForm;

	public List<String> intvalue(int fizz) {
	    System.out.println(fizz);

		int number = fizz + 100;
	    System.out.println(number);

		List<String> fizznumber = new ArrayList<>();
		for (fizzBazzForm.getFizz(); number == fizz; fizz++) {
			if (fizz / 15 == 0) {
				fizznumber.add("fizzBazz");
			    System.out.println(0);

			} else if (fizz / 5 == 0) {
				fizznumber.add("bazz");
			    System.out.println(1);
			} else if (fizz / 3 == 0) {
				fizznumber.add("fizz");
			    System.out.println(2);

			}
		}

		return fizznumber;

	}
}
