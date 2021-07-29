package day05_loop;

import java.util.Scanner;

public class Ex02_For {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int repet;
		System.out.print("반복할 횟수 입력 : ");
		repet = sc.nextInt();
		
		//증감식
		for(int i=0;i<repet;i++) {
			System.out.println(i + " 반복(증감식)");
		}
		
		System.out.println();
		
		//감소식
		for(int i=10;i>0;i--) {
			System.out.println(i+" 반복(감소식)");
		}
		
		//2씩 증가
		System.out.println();
		for (int i=0; i<10; i+=2) {
			System.out.println(i+" 반복(2증가)");
		}
	}

}
