package com.quiz.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson03.domain.RealEstate;
import com.quiz.lesson03.mapper.RealEstateMapper;

@Service
public class RealEstateBO {
	
	@Autowired
	private RealEstateMapper realestateMapper;
	
	// input: id(int)
	// output : RealEstate or null
	public RealEstate getRealEstateById(int id) {
		
		return realestateMapper.selectRealEstateById(id);
	}
	
	// input: rentPrice(필수)
	// output: List<RealEstate>
	public RealEstate getRealEstateListByRentPrice(int rentPrice) {
		realEstateMapper.selectRealEstateListByRentPrice(int rentPrice);
	}
	
}
