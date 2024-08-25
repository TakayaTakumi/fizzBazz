package com.example.demo.service.imple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.form.FizzBazzForm;

@Service
public class FizzBazzService {

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
				fizzBazzDetail.add("");
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
}
//for (fizz = 1; fizz <= number; fizz++) {
//	if (fizz % 15 == 0) {
//		fizzBazzForm.setName("fizzBazz");
//		fizzBazzForm.setFizzBazz(fizz);
//	} else if (fizz % 5 == 0) {
//		fizzBazzForm.setName("bazz");
//		fizzBazzForm.setFizzBazz(fizz);
//	} else if (fizz % 3 == 0) {
//		fizzBazzForm.setName("fizz");
//		fizzBazzForm.setFizzBazz(fizz);
//	} else {
//		fizzBazzForm.setFizzBazz(fizz);
//	}
//}

//List<String> fizzBazzDetail = new ArrayList<String>();
//for (fizz = 1; fizz <= number; fizz++) {
//	if (fizz % 15 == 0) {
//		fizzBazzDetail.add("fizzBazz");
//		String fizzBazzNumber = Integer.toString(fizz);
//		fizzBazzDetail.add(fizzBazzNumber);
//	} else if (fizz % 5 == 0) {
//		fizzBazzDetail.add("bazz");
//		String fizzBazzNumber = Integer.toString(fizz);
//		fizzBazzDetail.add(fizzBazzNumber);
//	} else if (fizz % 3 == 0) {
//		fizzBazzDetail.add("fizz");
//		String fizzBazzNumber = Integer.toString(fizz);
//		fizzBazzDetail.add(fizzBazzNumber);
//	} else {
//		String fizzBazzNumber = Integer.toString(fizz);
//		fizzBazzDetail.add(fizzBazzNumber);
//	}
//}