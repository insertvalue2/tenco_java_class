package basic.ch13;

public class LottoGame {

	public static void main(String[] args) {
		// static 변수 --> 클래스 변수라고도 불린다. 
		
		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();

		
		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");
		
		// 오름 차순으로 정렬해보기 
		// 만약 1상자 2상자보다 크다면 어떤 행동을 하라
		// 단 변수에 값을 담고 출력 하세요.
		
		// 예상 1box = 5 , 2box = 3
		int tempBox = 0; 
		if(gameNumber1 > gameNumber2) {
			// 0    =   3  --> temp == 3   
			// 0    =   5  --> temp == 5
			tempBox = gameNumber1;
			// 3         
			gameNumber1 = gameNumber2;
			// 5  
			gameNumber2 = tempBox;
		}
		System.out.println();
		System.out.println("--------------------");
		// 정렬 --> 3, 5
		System.out.println(gameNumber1);
		System.out.println(gameNumber2);
		
		
		
	} // end of main 
}
