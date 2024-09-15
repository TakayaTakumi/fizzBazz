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

//Modelやviewに役割を与える
@Controller
public class fizzBazzController {
	//クラスをインスタンス化している
	@Autowired
	FizzBazzService fizzBazzService;

	//クラスをインスタンス化している
	@Autowired
	ModelMapper modelMapper;

	//Getリクエストを処理するメソッドを指定している
	@GetMapping("/Home")
	//画面で入力した値をFizzBazzFormに代入する
	public String getFizzBazzHome(@ModelAttribute FizzBazzForm form, Model model) {
		//ここで過去3件の入力値を取得している
		List<Integer> getpastData = fizzBazzService.getPastData();
		//画面に渡したいデータをmodelに追加している
		model.addAttribute("getpastData", getpastData);
		return "Home";
	}

	//Postリクエストを処理するメソッドを指定している
	@PostMapping("/Home")
	//ブラウザからのリクエストの値（パラメータ）を取得することができる
	//画面で入力した値をFizzBazzFormに代入する
	//入力値のバリデーションが実行される、その結果はBindingResultクラスに入る
	public String postFizzBazzHome(@RequestParam("fizz") int fizz, Model model,
			@ModelAttribute @Validated FizzBazzForm form,
			BindingResult baindingResult) {
		//viewから送られてきたmodelにエラーがあるかをチェック、BindingResultクラスのhasErrors()にエラーの内容が入る
		if (baindingResult.hasErrors()) {
			return getFizzBazzHome(form, model);
		}
		//fizzbazzの101~200までの数字が表示されるList
		List<Integer> resultNumbers = fizzBazzService.intvalue(fizz);
		//fizzBazzのString型の値が表示されるList
		List<String> fizzBazzList = fizzBazzService.fizzBazzResult(fizz);
		//画面に渡したいデータをmodelに追加している
		model.addAttribute("resultNumbers", resultNumbers);
		//画面に渡したいデータをmodelに追加している
		model.addAttribute("fizzBazzList", fizzBazzList);
		return "fizzBazz";
	}
}