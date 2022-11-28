package day06.mypac;
/*
 * [[VO ,DTO]]
 * 		DTO(Data Transfer Object)
 * 		값 오브젝트로써 
 * 		목적의 맞는 변수의 집합.
 * 		DataBase값 운반용으로 사용
 * 
 */



public class MemberVo {
	
	//캡슐화
	private String id;
	private String password;
	private String name;
	private String phoneNumber;
	private String adderss;
	private String birth;
	
	//Alt+Shift+S -> Getters and Setters 
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAdderss() {
		return adderss;
	}
	public void setAdderss(String adderss) {
		this.adderss = adderss;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
 

}
