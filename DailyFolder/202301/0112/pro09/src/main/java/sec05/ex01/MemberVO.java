package sec05.ex01;

import java.sql.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class MemberVO {
	
	private String id;
	private String id2;
	private String pwd;
	private String name;
	private String email;
	private Date joinDate;
	private List<String> id3;
}
