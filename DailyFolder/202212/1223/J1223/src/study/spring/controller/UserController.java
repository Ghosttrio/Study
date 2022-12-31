package study.spring.controller;

import study.spring.dao.UserDAO;
import study.spring.dto.UserDTO;
import study.spring.service.UserService;

public class UserController {
	
	UserService userService = new UserService();
	// 메소드명 : loginCheck
	// 전달인자 : userDTO
	// 리턴타임 : 없음
	// 기능 : service에 있는 getUserInfo를 실행
	public void loginCheck(UserDTO userDTO) {
//		UserService userService = new UserService();
		UserDTO resultDTO = userService.getUserInfo(userDTO);
		
		if(resultDTO != null) {
			System.out.println("Login Success");
		} else {
			System.out.println("Check your ID or PASSWORD");
		}
	}
	
//	메소드명 : join
//	기능 : main에서 전달받은 UserDTO를
//	dao의 memberList에 추가
//	전달인자 : UserDTO
	
	public void join(UserDTO userDTO) {
		userService.makeMembers(userDTO);
	}
	
	
////	service에 있는 makeMembers 호출
//	public void makeMembers(int count) {
////		UserService userService = new UserService(); 필드 영역으로 이사
//		this.userService.makeMembers(count);
//	}
}
