package com.quiz.lesson06.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.quiz.lesson06.domain.Booking;

@Mapper
public interface BookingMapper {
	
	public List<Booking> selectBookingList();
	
	public void insertBooking(
			@Param("name") String name,
			@Param("headcount") int headcount,
			@Param("day") String day,
			@Param("date") int date,
			@Param("phoneNumber")String phoneNumber,
			@Param("state")String state);
	
	
 }
