package 상속;

// 모든것은 Object의 자식이라 extends 안해줘도 되는 것
public class 사람 extends Object{
	// 사람의 기본적인 성질 ==> 멤버변수
	String name;
	int age;
	
	// 사람의 동작 ==> 멤버메서드
	public void eat() {
		System.out.println("먹다");
	}
	
	public void sleep() {
		System.out.println("잠자다");
	}

	@Override
	public String toString() {
		return "사람 [name=" + name + ", age=" + age + "]";
	}
}