package baekjoon1978;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt(); // 수의 개수
		int count = 0; // 소수 개수 
		for(int i=0;i<num;i++) // 수 만큼 돌리기
		{
			int n = s.nextInt();
			boolean t = true;
			if(n==1)
			{
				continue;
			}
			for(int j=2;j<n;j++)
			{
				if(n%j==0)
				{
					t = false;
				}
			}
			if(t)
			{
				count++;
			}
		}
		System.out.print(count);
	}

}
