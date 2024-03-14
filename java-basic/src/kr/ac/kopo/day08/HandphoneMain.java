package kr.ac.kopo.day08;

class Handphone {
	
	String name;
	String number;
	String company;
	int price;
	
}

public class HandphoneMain {

	public static void main(String[] args) {
		Handphone hp = new Handphone();
		Handphone hp2 = new Handphone();
		Handphone hp3 = new Handphone();
		
		hp.name = "S21";
		hp.number = "010-1111-1111";
		hp.company = "Samsung";
		hp.price = 1250000;
		
		hp2.name = "iphone13";
		hp2.number = "010-2222-2222";
		hp2.company = "Apple";
		hp2.price = 1350000;
		
		hp3.name = "iphone15";
		hp3.number = "010-3333-3333";
		hp3.company = "Apple";
		hp3.price = 1550000;
		
	/*	
		System.out.println("기기명 : " + hp.name);
		System.out.println("핸드폰 번호 : " + hp.number);
		System.out.println("제조사 : " + hp.company);
		System.out.println("가격 : " + hp.price);
		System.out.println();
		System.out.println("기기명 : " + hp2.name);
		System.out.println("핸드폰 번호 : " + hp2.number);
		System.out.println("제조사 : " + hp2.company);
		System.out.println("가격 : " + hp2.price);
		System.out.println();
		System.out.println("기기명 : " + hp3.name);
		System.out.println("핸드폰 번호 : " + hp3.number);
		System.out.println("제조사 : " + hp3.company);
		System.out.println("가격 : " + hp3.price);
		*/
		Handphone[] hpArr = {hp,hp2,hp3};
					
		for(Handphone p :hpArr) {	//핸드폰 형으로 배열을 받아온다는뜻
			System.out.println("소유주명 : " + p.name);
			System.out.println("전화번호 : " + p.number);
			System.out.println("제조사 : " + p.company);
			System.out.println("가격 : " + p.price);
		}
/*		
		for(int i = 0 ; i < hpArr.length ; i++) {
			System.out.println("소유주명 : " + hpArr[i].name);
			System.out.println("전화번호 : " + hpArr[i].number);
			System.out.println("제조사 : " + hpArr[i].company);
			System.out.println("가격 : " + hpArr[i].price);
		}
		System.out.println(hp);
		System.out.println(hpArr[0]);
		*/
	}

}
