package baekjoon4153;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// TODO Auto-generated method stub
		int x =0;
		int y =0;
		int z =0;
		int sum=0;
		while(true)
		{
			x = s.nextInt();
			y=s.nextInt();
			z=s.nextInt();
			if(x==0&y==0&&z==0)
			{
				break;
			}
			if(z<x)
			{
				sum=z;
				z =x;
				x =sum;
			}
			if(z<y)
			{
				sum=z;
				z =y;
				y =sum;
			}
			if((x*x)+(y*y)==(z*z))
			{
				System.out.println("right");
			}
			else
				System.out.println("wrong");
		}
	}

}
