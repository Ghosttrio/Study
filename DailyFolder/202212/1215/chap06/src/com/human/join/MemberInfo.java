package com.human.join;

public class MemberInfo {

	String id;
	String password;
	String tel;
	String address;
	
	MemberInfo(String id, String password){
		this.id = id;
		this.password = password;
	}
	MemberInfo(String id, String password, String tel, String address){
		this.tel = tel;
		this.address = address;
	}
	
// �޼ҵ�� : toString
// ��� �ʵ��� ������ �̻ڰ� ǥ��
// �������� : ����
// ����Ÿ�� : String

	public String toString() {
		String temp = "";
		temp += "id : " + this.id;
		temp += "\npassword : " + this.password;
		temp += "\ntel : " + this.tel;
		temp += "\naddress : " + this.address;
		temp += "\n";
		return temp;
	}
//	�������̵�
//	toString�� ���� �ִ�.
//	����°�
}

