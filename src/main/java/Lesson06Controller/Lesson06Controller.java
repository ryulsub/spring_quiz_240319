package Lesson06Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson06/quiz01")
@Controller
public class Lesson06Controller {
	
	// 즐겨찾기 화면
	// http://localhost/lesson06/quiz01/add-bookmark-view
	@GetMapping("add-bookrmark-view")
	public String addBookmarkView() {
		return "lesson06/addBooKmark";
	}
	
	// AJAX가 하는 요청
	@ResponseBody
	@PostMapping("/add-bookmark")
	public String addBookmark() {
			@RequestParam("")
			
		// db insert
			
		// 응답값 
		
	}

}
