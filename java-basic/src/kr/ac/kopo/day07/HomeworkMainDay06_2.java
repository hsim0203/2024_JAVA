package kr.ac.kopo.day07;

import java.util.Random;

public class HomeworkMainDay06_2 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int[] nums = new int[5];
		
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = r.nextInt(100);
		}
		
		System.out.println("  < PRINT >");
		for(int data : nums) {
			System.out.print(data + " ");
		}
		System.out.println();
		
		System.out.println("  < REBER >");
		for(int i = nums.length -1 ; i>= 0 ; i--) {
			int n1 = nums[i] % 10;
			int n10 = nums[i] /10;
			
			System.out.print(n1*10 + n10 + " ");
		}
		
		
	}

}
