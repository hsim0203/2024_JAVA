package kr.ac.kopo.day01;

public class HelloMain {
	
	public static void main(String[] args) {
		
		System.out.print(3);
		System.out.print(' ');
		System.out.print('+');
		System.out.print(' ');
		System.out.print(4);
		System.out.println( );
		System.out.println(3 + " + " + 4);
		System.out.printf("%d %c %d\n", 3,'+',4);
		System.out.printf("[%4d] %c %d\n", 3,'+',4);
		System.out.printf("[%-4d] %c %d\n", 3,'+',4);	//  왼쪽정렬
		System.out.printf("[%04d] %c %d\n", 3,'+',4);	//  남은자리 0으로 채워넣는거
		System.out.println('3'+'4');
	}
}

	