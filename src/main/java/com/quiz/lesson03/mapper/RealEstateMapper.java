package com.quiz.lesson03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.quiz.lesson03.domain.RealEstate;

@Mapper
public 	interface RealEstateMapper {
	
	public RealEstate selectRealEstateById(int id);
	public List<RealEstate> selectRealEstateListByRentPrice(int rentPrice);
	
	// mapper 인터페이스가 xml로 파라미터 전송 시 1개만 보낼 수 있다.
	// @Param 어노테이션을 사용하면 파라미터를 하나의 맵으로 구성해준다.
	public List<RealEstate> selectRealEstateListByAreaPrice(
			@Param("area") int area,
			@Param("price") int price);
	
	public int insertRealEstate(RealEstate realestate);
	
	public int insertRealEstateAsField(
			@Param("realtor1Id") int realtor1Id, 
			@Param("address") String address,
			@Param("area") int area, 
			@Param("type") String type, 
			@Param("price") int price, 
			@Param("rentPrice") Integer rentPrice);
	
}
