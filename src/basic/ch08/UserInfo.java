package basic.ch08;

public class UserInfo {
	
	public String userId; 
	public String userPassword; 
	public String userName; 
	public String userAddress; 
	public String phoneNumber; 
	
	// 생성자 오버로딩이란 
	// 생성자의 개수가 여러개 있다 
	
	// 기본 생성자 형태 만들어 보기 
	public UserInfo() {}
	
	public UserInfo(String id) {
		userId = id;
	}
	
	public UserInfo(String id, String name) {
		userId = id; 
		userName = name;
	}
	
	// 연습 문제 
	// 1 - 매개변수 3개를 받는 생성자를 만들어 주세요 
	
	// 2 - 매개변수 4개를 받는 생성자를 만들어 주세요
	
	// 3 - 매개변수 5개를 받는 생성자를 만들어 주세요
	
	
} // end of class 
