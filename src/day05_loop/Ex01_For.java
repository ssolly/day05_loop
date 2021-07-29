package day05_loop;

public class Ex01_For {

	/*
	 # For(반복문)
	  - for(초기값;조건식;증감식) {
	    	종속문장
	    }
	  - for문은 ;개수가 무조건 2개가 들어와야한다
	  - 초기값 조건식 증감식은 없어도 문법적으로 상관 없다
	 */
	
	public static void main(String[] args) {
		
		int sum=0, cnt=1;
		sum+=1;	//sum+=cnt++;
		sum+=2;	//sum+=cnt++;
		sum+=3;	//sum+=cnt++;
		sum+=4;	//sum+=cnt++;
		sum+=5;	//sum+=cnt++;
		sum+=6;	//sum+=cnt++;
		sum+=7;	//sum+=cnt++;
		sum+=8;	//sum+=cnt++;
		sum+=9;	//sum+=cnt++;
		sum+=10; //sum+=cnt++;
		System.out.println(sum);
		//System.out.println(cnt);
		
		sum=0;
		
		for(cnt=1; cnt<=10;cnt++) {
			sum+=cnt;
		}
		System.out.println("sum = "+sum);
		System.out.println("cnt = " + cnt);

	}
}
