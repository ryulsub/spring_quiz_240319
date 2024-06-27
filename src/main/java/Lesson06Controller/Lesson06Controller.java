package Lesson06Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson06")
@Controller
public class Lesson06Controller {

	// 즐겨찾기 추가 화면
	// http://localhost:8080/lesson06/add-bookmark-view
	@GetMapping("/add-bookmark-view")
	public String addBookmarkView() {
		return "lesson06/addBookmark";
	}
	
	// AJAX가 하는 요청 -> AJAX가 하는 응답값은 반드시 String이다.
		@ResponseBody
		@PostMapping("/add-bookmark")
		public String addUser( 
				@RequestParam("id") int id,
				@RequestParam("name") String name,
				@RequestParam("url") String url) {
		
			// db insert
			addbookmarkBO.addBookrmark(id, name, url);
			
			// 응답값 - response body에 "성공" 들어감
			return "성공";
			
		}
		
	
	// 즐겨찾기 목록 화면
	// http://localhost:8080/lesson06/bookmark-list-view
	@GetMapping("/bookmark-list-view")
	public String bookmarkListView() {
		return "lesson06/bookmarkList";
	}
}