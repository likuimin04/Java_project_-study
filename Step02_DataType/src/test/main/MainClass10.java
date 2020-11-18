package test.main;

public class MainClass10 {
	public static void main(String[] args) {
		// 기본 데이터 type
		int num1=10;
		double num2=10.1;
		char ch1='a';
		// 참조 데이터 type
		// 참조 데이터 타입은 기능을 가지고 있다.
		String str="abcde12345";
		// length() 메소드는 문자영의 길이를 리턴한다.
		int size=str.length();
		char ch=str.charAt(5);  // 0~5번째 문자/숫자 리턴(반환)
		//소문자를 모두 대문자로 변환한 문자열 얻어내기
		String result=str.toUpperCase();
	}
}
