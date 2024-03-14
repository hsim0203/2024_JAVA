package kr.ac.kopo.day07;

import java.util.Scanner;

public class HomeworkMainDay06_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];	//
		
		for(int i = 0 ; i < score.length ; i++) {
			System.out.print(i+1 + "\'s 성적 : ");
			score[i] = Integer.parseInt(sc.nextLine());
		}
		
		int total = 0;
		int ercnt = 0;

		System.out.println("------------------------------");
		System.out.println("번호    성적      학점		  ");
		System.out.println("------------------------------");
		for(int i = 0 ; i < score.length ; i++) {
			if(score[i]>=0 && score[i] <= 100) {
				char grade;
				if(score[i] >= 90) {
					grade='A';
				}else if(score[i] >= 80) {
					grade='B';
				}else if(score[i] >= 70) {
					grade='C';
				}else if(score[i] >= 60) {
					grade='D';
				}else{
					grade='F';
				}      
				total = total + score[i];
				System.out.printf("%d	%d	%c",i+1,score[i],grade);
			}else {
				System.out.print(i+1 + "	ERROR!!!");
				ercnt++;
		}
			System.out.println();
		}
		System.out.println("------------------------------");
		System.out.println(score.length + "회 입력 중 ["+ercnt+"]회 에러발생");
		System.out.println("총점 : " + total +"점");
		System.out.printf("평균 : %.2f점", total / 5. );  //5로 나누면 정수 / 정수라 실수가아니라 묵시적 형변환 또는 5옆에.을 찍음
	}

}
