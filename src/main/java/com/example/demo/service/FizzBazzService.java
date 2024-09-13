package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.form.FizzBazzForm;
import com.example.demo.repository.fizzBazzMapper;

@Service
public class FizzBazzService {

	@Autowired
	fizzBazzMapper fizzBazzMapper;

	FizzBazzForm fizzBazzForm;

	public List<String> fizzBazzResult(int fizz) {

		int number = fizz + 100;
		List<String> fizzBazzDetail = new ArrayList<String>();
		for (fizz = 1; fizz <= number; fizz++) {
			if (fizz % 15 == 0) {
				fizzBazzDetail.add("fizzBazz");

			} else if (fizz % 5 == 0) {
				fizzBazzDetail.add("bazz");

			} else if (fizz % 3 == 0) {
				fizzBazzDetail.add("fizz");

			} else {
				fizzBazzDetail.add("n");
			}
		}
		return fizzBazzDetail;
	}

	public List<Integer> intvalue(int fizz) {

		int number = fizz + 100;
		List<Integer> getNumber = new ArrayList<Integer>();
		for (fizz = 1; fizz <= number; fizz++) {
			if (fizz % 15 == 0) {
				getNumber.add(fizz);

			} else if (fizz % 5 == 0) {
				getNumber.add(fizz);

			} else if (fizz % 3 == 0) {
				getNumber.add(fizz);

			} else {
				getNumber.add(fizz);
			}
		}
		return getNumber;
	}

	public List<Integer> getPastData() {
		return fizzBazzMapper.pastData();
	}

}