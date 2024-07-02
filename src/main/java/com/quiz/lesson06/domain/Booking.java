package com.quiz.lesson06.domain;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Booking {
	
	private int id;
	private String name;
	private int headcount;
	private int day;
	private LocalDateTime date;
	private String phoneNumber;
	private String state;
	private LocalDateTime createdAt;
	private LocalDateTime  updatedAt;
	
	
	
	
	
}
