package day05_loop;

import java.util.Scanner;

public class Ex02_For {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int repet;
		System.out.print("�ݺ��� Ƚ�� �Է� : ");
		repet = sc.nextInt();
		
		for(int i=0;i<repet;i++) {
			System.out.println(i + "�ݺ�");
		}
	}

}
