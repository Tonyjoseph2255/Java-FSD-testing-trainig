package Day3;

import java.util.Scanner;

public class fibbonacciseries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
				int f=1,s=1,t;
				System.out.println(f);
				System.out.println(s);
				for(int i=3;i<=n;i++) {
					t=f+s;
					System.out.println(t);
					f=s;
					s=t;
				}
				
	}

}
