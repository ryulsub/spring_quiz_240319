package com.quiz.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/quiz02") 
@RestController // @Controller + @ResponseBody
public class Lesson01Quiz02RestController {
	// @ResponseBody + return String => HttpMessageConverter => HTML
	// @ResponseBody + return 객체(Map, 객체, List) => HttpMessageConverter => jackson lib => JSON
	
	// http://localhost:8080/lesson01/quiz02/1
	@RequestMapping("/1")
	public List<Map<String, Object>> quiz02_1() {
		List<Map<String, Object>> list = new ArrayList<>();
		
		Map<String, Object> map = new HashMap<>();
		map.put("Rate", 15);
		map.put("Director", "봉준호");
		map.put("Time", 131);
		map.put("Title", "기생충");
		list.add(map);
		
		map = new HashMap<>();
		map.put("Rate", 0);
		map.put("Director", "로베르토 베니니");
		map.put("Time", 116);
		map.put("Title", "인생은 아름다워");
		list.add(map);
		
		map = new HashMap<>();
		map.put("Rate", 12);
		map.put("Director", "크리스토퍼 놀란");
		map.put("Time", 147);
		map.put("Title", "인셉션");
		list.add(map);
		
		map = new HashMap<>();
		map.put("Rate", 19);
		map.put("Director", "윤종빈");
		map.put("Time", 133);
		map.put("Title", "범죄와의 전쟁 : 나쁜놈들 전성시대");
		list.add(map);
		
		map = new HashMap<>();
		map.put("Rate", 15);
		map.put("Director", "프란시스 로렌스");
		map.put("Time", 137);
		map.put("Title", "헝거게임");
		list.add(map);
		
		return list;
	}
	
	// http://localhost:8080/lesson01/quiz02/2
	@RequestMapping("/2")
	public List<Board> quiz02_2() {
		List<Board> list = new ArrayList<>();
		
		Board board = new Board(); 
		board.setTitle("안녕하세요 가입인사 드립니다.");
		board.setUser("marobiana");
		board.setContent("안녕하세요.가입했어요. 앞으로 잘부탁드립니다. 활동 열심히 하겠습니다.");
		list.add(board);
		
		board = new Board();
		board.setTitle("헐 대박");
		board.setUser("bada");
		board.setContent("오늘 목요일이었어...금요일인줄");
		list.add(board);
		
		board = new Board();
		board.setTitle("오늘 데이트 한 이야기 해드릴게요");
		board.setUser("dulumary");
		board.setContent("...");
		list.add(board);
		
		return list;
	}
	
	// http://localhost:8080/lesson01/quiz02/3
	@RequestMapping("/3")
	public ResponseEntity<Board> quiz02_3() {
		Board board = new Board();
		board.setTitle("안녕하세요 가입인사 드립니다.");
		board.setUser("marobiana");
		board.setContent("안녕하세요.가입했어요. 앞으로 잘부탁드립니다. 활동 열심히 하겠습니다.");
		
		return new ResponseEntity<>(board, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	
	
}			

