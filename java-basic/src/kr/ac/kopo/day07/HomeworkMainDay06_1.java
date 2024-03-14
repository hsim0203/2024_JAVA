package kr.ac.kopo.day07;

import java.util.Scanner;

public class HomeworkMainDay06_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		
		for(int i = 0 ; i < num.length ; i++) {
			System.out.print("num"+(i+1)+" : ");
			num[i] = sc.nextInt();		
			}
		for (int mod = 0; mod <= 1 ; mod++) {
			System.out.printf("< %s >\n", mod == 0 ? "짝수" : "홀수");
			for(int i : num ) {
				if(i % 2 == mod)
					System.out.print(i + " ");
			}
			System.out.println(" ");
		}
	}

}
