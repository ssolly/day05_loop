package day05_loop;

public class Ex04_For {

	public static void main(String[] args) {
		int su=1, sum=0;
		for (;su<=10;) {
			sum+=su;
			su++;
		}
		System.out.println("1-10까지의 합 : "+sum);
		
		//무한루프
		for(;;) {
			System.out.println("무한루프 실행");
		}
		
	}
}
