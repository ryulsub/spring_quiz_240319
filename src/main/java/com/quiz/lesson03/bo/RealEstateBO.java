package com.quiz.lesson03.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson03.domain.RealEstate;
import com.quiz.lesson03.mapper.RealEstateMapper;

@Service
public class RealEstateBO {
	
	@Autowired
	private RealEstateMapper realEstateMapper;

	// input: id(int)
	// output: RealEstate(단건) or null
	public RealEstate getRealEstateById(int id) {
		return realEstateMapper.selectRealEstateById(id);
	}
	
	// input: rentPrice(필수)
	// output: List<RealEstate>
	public List<RealEstate> getRealEstateListByRentPrice(int rentPrice) {
		return realEstateMapper.selectRealEstateListByRentPrice(rentPrice);
	}
	
	// input: area, price
	// output: List<RealEstate>
	public List<RealEstate> getRealEstateListByAreaPrice(int areaaaaa, int price) {
		return realEstateMapper.selectRealEstateListByAreaPrice(areaaaaa, price);
	}
	
	// input : RealEstateAsField
	// output: 성공한 행의 개수(int)
	public int addRealEstateAsField(int realtor1Id, String address,
			int area, String type, int price, Integer rentPrice) {
		
		return realEstateMapper.insertRealEstateAsField(realtor1Id, address, area, type, price, rentPrice);
	}
	
	// input: id, type, price
	// output: int 
	public int updateRealEstateById(int id, String type, int price) {
		return realEstateMapper.updateRealEstateById(id, type, price);
	}
	
	
	// input: id
	// output: x
	public void deleteRealEstateById(int id) {
		realEstateMapper.deleteRealEstateById(id);
	}

}
