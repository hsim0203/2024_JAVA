package kr.ac.kopo.day08;

public class MethodMain02 {

/*	static void getSum(int a , int b) {
		int sum = 0;
		while(a <= b) {
			sum = sum+a++;
		}
		System.out.println("총합 = " + sum); //getSum은 sum값을 가져와서 출력할수는 없고, 메서드 안에서 출력된 sum값을 가져옴
	}
*/	
	//호출자 main, 피호출자 getSum
	static int getSum(int a , int b) {	//int형 a와 b값을 받아서 sum 을 계산해서 int형으로 다시 돌려줌
		int sum = 0;
		while(a <= b) {
			sum = sum+a++;
		}return sum;	// sum값을 다시 main 메소드로 돌려줌
	}
	
	public static void main(String[] args) {
		
		int a = 1, b=5;
		int sum = getSum(a,b);	//a,b를 보내고 sum값을 sum에 받아 저장함
		System.out.println(sum);
	}
}
