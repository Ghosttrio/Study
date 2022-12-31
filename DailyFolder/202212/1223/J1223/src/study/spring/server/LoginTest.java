package study.spring.server;

import study.spring.controller.UserController;
import study.spring.dao.UserDAO;
import study.spring.dto.UserDTO;

public class LoginTest {

	public static void main(String[] args) {
		UserController userController = new UserController();
		String id = "id7";
		String password = "pw7";

		UserDTO userDTO = new UserDTO();
		userDTO.setId(id);
		userDTO.setPassword(password);
		userController.join(userDTO);
		
		userDTO.setId("id");
		userDTO.setPassword("password");
		userDTO.setNickName("asdasd");
		userController.join(userDTO);
		
		UserDAO a = new UserDAO();
		
		
		userController.loginCheck(userDTO);
	}

}
//알트 화살표 컨트롤클릭