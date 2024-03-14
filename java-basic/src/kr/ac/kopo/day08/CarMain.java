package kr.ac.kopo.day08;

//실행클래스
public class CarMain {

	public static void main(String[] args) {
		
		Car c = new Car();	//추상클래스를 힙영역에 생성하고 주소를 가지는 c 를 만듬
		Car c2 = new Car();	//new를 쓸때 Car클래스의 name,price 공간 생성
		Car c3 = new Car();	
		
		c.name = "소나타";		
		c.price = 3600;
		
		c3.name = "모닝";		
		c3.price = 1000;
		

		
		System.out.println("자동차명 : " + c.name+ "\n 가격 : " +c.price);
		System.out.println("자동차명 : " + c2.name+ "\n 가격 : " +c2.price);	
		System.out.println("자동차명 : " + c3.name+ "\n 가격 : " +c3.price);	
		//c2의 값은 new 선언으로 생성시 초기화 된 값 그대로로 null과 0값임

		
	}

}
