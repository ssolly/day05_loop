package day05_loop;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 사용자가 숫자를 입력했을 때 1부터 입력한 숫자 사이의 합을 구하시오
		int num,sum=0;
		System.out.print("숫자 입력 : ");
		num=sc.nextInt();
		for(int i=1; i<=num;i++) {
			sum+=i;
		}
		System.out.println("총합 : " + sum);
		
		// 2. 사용자가 입력한 숫자의 약수를 출력하시오
		int num1;
		System.out.print("숫자 입력 : ");
		num1 = sc.nextInt();
		
		System.out.print(num1+"의 약수 : ");
		for(int i=1; i<=num1; i++) {
			if (num1%i==0) {
				System.out.print(i+"  ");
			}
		}
		System.out.println();
		
		// 3. 0부터 90까지 10단위로 출력하시오
		for (int i=0; i<=90; i+=10) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		// 4. 1~10 까지의 짝수 합과 홀수의 합 구하기
		int n1,n2,oddSum=0,evenSum=0;
		for (int i=1; i<=10;i++) {
			if (i%2==0) {
				evenSum+=i;
			} else {
				oddSum+=i;
			}
		}
		System.out.println("짝수 합 : "+evenSum+", 홀수 합 : "+oddSum);
		
		// 5. 입력한 수의 짝수만 출력 후 짝수 갯수 구하기
		int input, cnt=0;
		System.out.print("숫자 입력 : ");
		input=sc.nextInt();
		System.out.print("짝수 : ");
		for (int i=1; i<=input;i++) {
			if (i%2==0) {
				System.out.print(i+"  ");
				cnt++;
			}
		}
		System.out.println("\n갯수 : " + cnt);
	}
}
