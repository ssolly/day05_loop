package day05_loop;

public class Ex01_For {

	/*
	 # For(�ݺ���)
	  - for(�ʱⰪ;���ǽ�;������) {
	    	���ӹ���
	    }
	  - for���� ;������ ������ 2���� ���;��Ѵ�
	  - �ʱⰪ ���ǽ� �������� ��� ���������� ��� ����
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
