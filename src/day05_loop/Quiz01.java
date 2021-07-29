package day05_loop;

public class Quiz01 {

	public static void main(String[] args) {
		
		/*
		 1. ������ ���� ����Ͻÿ�
		    1.hello
		    2.hello
		    3.hello
		    4.hello
		 */
		for (int i=1; i<5; i++) {
			System.out.println(i+".hello");
		}
		
		/*
		 2. 1-100������ �� �߿��� �� ���� 528�� �� i�� ���� ����Ͻÿ�
		 */
		 int sum=0;
		 for (int i=1; i<=100; i++) {
			 sum+=i;
			 if (sum==528) {
				 System.out.println("���� 528�� �� i�� �� : "+i);
				 break;
			 }
		 }
		 
		 /*
		  3. for���� �̿��Ͽ� �Ʒ��� ���� ����Ͻÿ�.
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
