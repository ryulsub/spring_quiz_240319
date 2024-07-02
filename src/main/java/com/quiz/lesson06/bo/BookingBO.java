package com.quiz.lesson06.bo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.quiz.lesson06.domain.Booking;
import com.quiz.lesson06.mapper.BookingMapper;

@Service
public class BookingBO {
	
	@Autowired
	private BookingMapper bookingMapper;

	// input: X
	// output: List<Booking>
	public List<Booking> getBookingList() {
		return bookingMapper.selectBookingList();
	}
	
	// input:id
	// output:int
	public int deleteBookingById(int id) {
		return bookingMapper.deleteBookingById(id);
	}
	
	public void addBooking(String name, LocalDate date,
			int day, int headcount, String phoneNumber) {
		
		bookingMapper.insertBooking(name, date, day, headcount, phoneNumber);
	}
	
	// input: name, phoneNumber
	// output: Booking(최신) or null
	public Booking getLatestBookingByNamePhoneNumber(String name, String phoneNumber) {
		// 리스트가 없을 때: [] 		리스트가 있을 때: [booking1, booking2, booking3]
		List<Booking> bookingList = bookingMapper.selectBookingListByNamePhoneNumber(name, phoneNumber);
		
		return bookingList.isEmpty() ? null : bookingList.get(bookingList.size());
	}
}
