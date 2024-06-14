package com.quiz.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson03.bo.RealEstateBO;
import com.quiz.lesson03.domain.RealEstate;

@RequestMapping("/lesson03/quiz01")
@RestController
public class Lesson03Quiz01RestController {
	
	@Autowired
	private RealEstateBO realestateBO;
	
	// http://localhost/lesson03/quiz01?id=20
	// /lesson03/quiz01/1?id=20
	@RequestMapping("/1")
	public RealEstate quiz01_1(
		@RequestParam(value = "id") int id
			) {

	return realestateBO.getRealEstateById(id);
 }
	
	// input(request): rent_price(필수)
	// output(response): List<RealEstate>
	// /lesson03/quiz01/2?rent_price=90
	@RequestMapping("/2")
	public RealEstate quiz01_2() {
			@RequestParam("rent_price") int rentPrice) {
	
		return realEstateBO.RealEstateListByRentPrice(int rentPrice); 
	}
}

