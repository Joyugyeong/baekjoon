package baekjoon2525;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		B+=C;
		if(B>=60)
		{
			while(B>=60) {
				B-=60;
				A++;
				if(A>=24)
				{
					A=0;
				}
			}
		}
		System.out.print(A+" "+B);
	}
}
