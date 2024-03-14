package kr.ac.kopo.day08;

/*

	**********
	Hello
	**********
	Hi
	**********
	Good-bye
	**********

 */

public class MethodMain01 {
/*	//반환형 메소스명(매개변수)
	static void printStar(){
		System.out.println("**********");
	}
	*/
	static void printStar(char ch,int cnt){
		for(int i = 0 ; i <cnt ; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		
		printStar('*',10);  // int cnt = 10;
		System.out.println("Hello");
		printStar('$',5);	// int cnt = 5;
		System.out.println("Hi");
		printStar('#',20);  // int cnt = 20;
		System.out.println("Good-Bye");
		printStar('♬',16);  // int cnt = 16;
		
		/*
		System.out.println("**********");
		System.out.println("Hello");
		System.out.println("**********");
		System.out.println("Hi");
		System.out.println("**********");
		System.out.println("Good-Bye");
		System.out.println("**********");
*/
		
	}
}
