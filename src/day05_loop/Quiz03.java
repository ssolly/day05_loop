package day05_loop;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. ����ڰ� ���ڸ� �Է����� �� 1���� �Է��� ���� ������ ���� ���Ͻÿ�
		int num,sum=0;
		System.out.print("���� �Է� : ");
		num=sc.nextInt();
		for(int i=1; i<=num;i++) {
			sum+=i;
		}
		System.out.println("���� : " + sum);
		
		// 2. ����ڰ� �Է��� ������ ����� ����Ͻÿ�
		int num1;
		System.out.print("���� �Է� : ");
		num1 = sc.nextInt();
		
		System.out.print(num1+"�� ��� : ");
		for(int i=1; i<=num1; i++) {
			if (num1%i==0) {
				System.out.print(i+"  ");
			}
		}
		System.out.println();
		
		// 3. 0���� 90���� 10������ ����Ͻÿ�
		for (int i=0; i<=90; i+=10) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		// 4. 1~10 ������ ¦�� �հ� Ȧ���� �� ���ϱ�
		int n1,n2,oddSum=0,evenSum=0;
		for (int i=1; i<=10;i++) {
			if (i%2==0) {
				evenSum+=i;
			} else {
				oddSum+=i;
			}
		}
		System.out.println("¦�� �� : "+evenSum+", Ȧ�� �� : "+oddSum);
		
		// 5. �Է��� ���� ¦���� ��� �� ¦�� ���� ���ϱ�
		int input, cnt=0;
		System.out.print("���� �Է� : ");
		input=sc.nextInt();
		System.out.print("¦�� : ");
		for (int i=1; i<=input;i++) {
			if (i%2==0) {
				System.out.print(i+"  ");
				cnt++;
			}
		}
		System.out.println("\n���� : " + cnt);
	}
}
