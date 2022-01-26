package baekjoon11653;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int  N =s.nextInt();
		int i=2;
		while(N>=i)
		{
			if(N%i==0)
			{
				System.out.println(i);
				N = N/i;
			}
			else
			{
				i++;
			}
		}
	}

}
