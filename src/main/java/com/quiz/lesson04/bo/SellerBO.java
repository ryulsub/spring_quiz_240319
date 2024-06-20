package com.quiz.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson04.domain.Seller;
import com.quiz.lesson04.mapper.SellerMapper;

@Service
public class SellerBO {
	
	@Autowired
	private SellerMapper sellerMapper;
	
	// input: 파라미터들
	// output: X
	public void addSeller(String nickname111, 
			String profileImageUrl111111, double temperature22223) {
		
		sellerMapper.insertSeller(nickname111, profileImageUrl111111, temperature22223);
	}
	
	// input:X
	// output:Seller(채워져 있거나 null)
	public Seller getLatestSeller() {
		return sellerMapper.selectLatestSeller();
	}
}
