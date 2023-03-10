package 생성자;

public class 전화기 {
	// 성질 : 멤버변수 (가격, 모양)
	// public은 아무데서나(다른 패키지에서도) 접근 가능 설정(접근제어자)
	public int price;	// 멤버변수는 자동 초기화를 시켜준다 (= 0)
	public String shape;	// 기본형이 아닌 경우(참조형) 모두 null로 초기화
	
	// 눈에 보이지는 않지만 기본 생성자가 만드렁져 있음
	// 묵시적으로 기본 생성자가 만들어져 있음
	// ==> 객체 생성할 때마다 이 메서드를 자동호출하여
	//	   전화기 객체가 만들어졌음. 프린트 하고 싶으면?
	public 전화기() {
		System.out.println("전화기 객체가 생성됨.");
	}
	
	// 동작 : 멤버메서드 (=함수), 동적인 기능을 수행
	// 		인터넷하다, 카톡하다
	public void 인터넷하다() {
		// 기능처리하는 방법을 나열
		System.out.println("와이파이로 연결하다");
		System.out.println("데이터로 연결하다");
	}
	public void 카톡하다() {
		System.out.println("자바 단체톡을 하다");
		System.out.println("게시물을 올리다");
	}
}