package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface fizzBazzMapper {

	public List<Integer> pastData();

}
