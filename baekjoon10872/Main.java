package baekjoon10872;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum=1;
		for(int i=n;i>0;i--)
		{
			sum = sum*i;
		}
		if(n==0)
		{
			sum =1;
		}
		System.out.print(sum);
		
	}

}
