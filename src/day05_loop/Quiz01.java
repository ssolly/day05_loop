package day05_loop;

public class Quiz01 {

	public static void main(String[] args) {
		
		/*
		 1. 다음과 같이 출력하시오
		    1.hello
		    2.hello
		    3.hello
		    4.hello
		 */
		for (int i=1; i<5; i++) {
			System.out.println(i+".hello");
		}
		
		/*
		 2. 1-100까지의 합 중에서 그 합이 528일 때 i의 값을 출력하시오
		 */
		 int sum=0;
		 for (int i=1; i<=100; i++) {
			 sum+=i;
			 if (sum==528) {
				 System.out.println("합이 528일 때 i의 값 : "+i);
				 break;
			 }
		 }
		 
		 /*
		  3. for문을 이용하여 아래와 같이 출려하시오.
		    1 2 3 4 5 
		    6 7 8 9 10
		    ...
		    21 22 23 24 25
		  */
		 for (int i=1; i<26; i++) {
			 System.out.print(i + "\t");
			 if (i%5==0) {
				 System.out.println();
			 }
		 }
	}
}
