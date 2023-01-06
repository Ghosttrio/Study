package sec01.ex01;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MemberVO {
// value object , == DTO
	
	private String id;
	private String pwd;
	private String name;
	private String email;
	private Date joinDate;
	
}
