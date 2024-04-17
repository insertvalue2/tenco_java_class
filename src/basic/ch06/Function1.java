package basic.ch06;

public class Function1 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int sum;
		add(10, 10);
		System.out.println("------------------");
		// 함수에 호출은 모양 맞추기 
		int reuslt2 = calcSum(10, 20); 
		System.out.println(reuslt2);

	} // end of main

	static int add(int n1, int n2) {
		int result;
		result = n1 + n2;
		return result;
	}

	// 연습 문제
	// 함수를 수정 -- 파라메터 정수 2개 받을 수 있도록 설계 
	// s1, s2  --> 
	// 1, 10 ---> 55
	// 7,  200 --> 7 + 8 + 9 ..
	// 7 + 8 + 9 + 10 
	static int calcSum(int n1, int n2) {
		int sum = 0;
		int i;
		for (i = n1; i <= n2; i++) { // 횟수 100 번 동작 하는 녀석
			sum = sum + i; // 5050
		}
		return sum;
	}
}
