package day05_loop;

public class Ex05_For {

	public static void main(String[] args) {
		
		int n1,n2,sum=0;
		for(n1=1;n1<=10;n1++) {
			System.out.println("+++����");
			for(n2=1;n2<=10;n2++) {
				System.out.print(n2+".����");
				sum+=1;
			}
			System.out.println("\n��----");
		}
		System.out.println("���� : "+sum);
	}
}


