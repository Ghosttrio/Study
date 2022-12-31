package study.spring.dao;

import java.util.ArrayList;
import java.util.List;

import study.spring.dto.UserDTO;

// DB등을 관리
public class UserDAO {

	
//	가입한 회원 목록
	private List<UserDTO> memberList = new ArrayList<UserDTO>();
	
	
	public UserDAO(){

	}
	
//	생성할 때 생성할 인원을 받아서 미리 회원목록 만들기
//	public UserDAO(int count){
//		makeMembers(count);
//	}
//  메소드명 : makeMembers
//  전달인자 : 인원 int
//	리턴타입 : void (없음)
//	기능 : 인원수대로 미리 memberList에 넣어 놓는다.
	
//	public void makeMembers(int count) {
////		양산 규칙 : id + 숫자
////		비밀번호 : pw + 숫자
//		for(int i=0; i<count; i++) {
//			UserDTO userDTO = new UserDTO();
//			userDTO.setId("id"+i);
//			userDTO.setPassword("pw"+i);
//			userDTO.setNickName("nick_"+i);
//			memberList.add(userDTO);
//		}
//	}
	public void makeMembers(UserDTO userDTO) {
		this.memberList.add(userDTO);
		
	}
	
	public List<UserDTO> getMemberList(){
		return this.memberList;
	}
}
