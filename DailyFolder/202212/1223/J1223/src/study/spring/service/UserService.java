package study.spring.service;

import java.util.List;

import study.spring.dao.UserDAO;
import study.spring.dto.UserDTO;

// 실무를 처리하는 담당
public class UserService {
	UserDAO userDAO = new UserDAO();

//	로그인 정보가 담겨있는 UserDTO를 전달받고
//	회원목록을 가져오고
//	목록 중에 로그인 정보가 있는지 판단
//	있으면 그 정보를 돌려주고
//	없으면 null을 return
//	메소드명 : getUserInfo
//	전달인자 : UserDTO
//	리턴타입 : UserDTO
	public UserDTO getUserInfo(UserDTO userDTO) {
		UserDTO resultDTO = null;
//		UserDAO userDAO = new UserDAO(10);
//		UserDAO userDAO = new UserDAO(); 필드영역으로 이사
//		dao가 가지고 있는 list를 가져와서 변수에 담는다
		List<UserDTO> userList = this.userDAO.getMemberList();
//		userList중에서 userDTO의 id,password가 일치하는게 있는지 검사

		
		for(int i=0; i<userList.size(); i++) {
			UserDTO member = userList.get(i);
			if(member.getId().equals(userDTO.getId()) && member.getPassword().equals(userDTO.getPassword())) {
				resultDTO = member;
				break;
			}
		}
		return resultDTO;
	}
	
	
	
	
//	메소드명 : makeMembers;
//	기능 : dao의 makeMembers 호출
//	전달인자 : 인원수
//	리턴타입 : void
//	public void makeMembers(int count) {
////		UserDAO userDAO = new UserDAO();
//		this.userDAO.makeMembers(count);
//	}
	public void makeMembers(UserDTO userDTO) {
//		UserDAO userDAO = new UserDAO();
		this.userDAO.makeMembers(userDTO);
	}
	
}
