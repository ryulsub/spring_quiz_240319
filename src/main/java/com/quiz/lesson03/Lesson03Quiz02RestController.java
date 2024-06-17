package com.quiz.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson03.bo.RealEstateBO;
import com.quiz.lesson03.domain.RealEstate;

@RequestMapping("/lesson03/quiz02")
@RestController
public class Lesson03Quiz02RestController {
	
	@Autowired
	private RealEstateBO realestateBO;
	
	// http://localhost/lesson03/quiz02/1
	@RequestMapping("/1")
	public String quis02_1() {
		RealEstate RealEstate = new RealEstate();
		RealEstate.setRealtor1Id(3); 
		RealEstate.setAddress("푸르지용 리버 303동 1104호"); 
		RealEstate.setArea(89); 
		RealEstate.setType("매매"); 
		RealEstate.setPrice(100000); 
		
		int rowCount = realestateBO.addRealEstate(RealEstate);
		return "입력 성공:" + rowCount;
	}
	
	// /lesson03/quiz02/2?realtor_id=5
	@RequestMapping("/2")
	public String quiz02_2(
			@RequestParam("realtor1_id") int realtor1Id) {
		
		int rowCount = RealEstateBO.addRealEstateAsField(
				realtor1Id,"썅떼빌리버 오피스텔 814호", 45, "월세", 100000, 120);
		
		return "입력 성공:" + rowCount;
	}
	
}
