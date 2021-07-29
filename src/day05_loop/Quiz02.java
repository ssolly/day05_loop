package day05_loop;

public class Quiz02 {

	public static void main(String[] args) {
		
		//1. 구구단 만들기
		for (int i=2; i<10; i++) {
			System.out.println(i+"단");
			for (int j=1; j<10; j++) {
				System.out.println(i+"x"+j+" = " + i*j);
			}
		}
		System.out.println();
		
		/*
		 2. 2중 for문을 이용하여 아래와 같이 출력하시오
		   1	2	3	4	5
		   2	4	6	8	10
		   3	6	9	12	15
		   4	8	12	16	20
		   5	10	15	20	25
		 */
		for (int i=1;i<6;i++) {
			for (int j=1;j<6;j++) {
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		/*
		 3. 2중 for문을 이용하여 아래와 같이 출력하시오
		   1	2	3	4	5
		   6	7	8	9	10
		   11	12	13	14	15
		   16	17	18	19	20
		   21	22	23	24	25
		 */
		for (int i=0; i<25; i+=5) {
			for (int j=1; j<6;j++) {
				System.out.print((i+j)+"\t");
			}
			System.out.println();
		}
		
		
	}
}
