package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		// int type 변수 선언과 동시에 값 대입하기
		int num1=10;
		// int type 변수 선언만 하고 (지역 변수는 선언만하면 만들어 지지 않는다)   [javascript에서는 undifain의 값이 들어가는데] 
		int num2;
		// 값은 나중에 대입하기 ( 값이 대입되는 시점에 변수가 만들어 진다)  [java에서는 undifain의 값은 안들어가고 나중 대입이 가능하다]
		num2=20;
		
		/*
		 *  정수의 표현 가능한 범위 순서
		 *  byte < short < int < long
		 *  **이거 무조건 외워야한다**
		 */
		int myInt=100;
		byte myByte=100;
		// int type 변수에 있는 값을 int type 변수에 대입
		int a=myInt;
		// byte type 변수에 값을 int type 변수에 대입
		int b=myByte;
		// int type 변수에 있는 값을 byte type 변수에 대입 (문법 오류: 작은게 큰것을 넣으면 넘치기 때문이다)
		
		/*
		 *  표현 가능한 범위가 더 넓은 변수에 담긴 내용을 대입 하려면
		 *  프로그래머가 대입을 해도 문제가 없다는것을 확인하고
		 *  명시적으로 casting 하면 대입이 가능하다.
		 *  예( myInt 안에 있는 숫자는 byte 범위를 절대 넘어가지 않다는 확신이 섰을 때! 책임은 프로그래머가 다 진다)
		 */
		byte c=(byte)myInt;  // 강제 casting 을 하면 대입이 가능  사용법 : (casting type) original type  
		// 100 이 저장되어 있는 변수에 200을 대입하고
		myInt=200;
		//강제 casting 해서 대입한다면?
		byte d=(byte)myInt; // 대입 결과는 -56이 된다. 이런 실수를 하면 큰실수가 되는것이다.
	}
}
