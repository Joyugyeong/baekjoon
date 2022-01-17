package beakjoon2581;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int M = s.nextInt(); 
		int N = s.nextInt();
		int sum =0;
		int min =0;
		for(;M<N+1;M++) // 수 만큼 돌리기
		{
	
			boolean t = true;
			if(M==1)
			{
				continue;
			}
			for(int j=2;j<M;j++)
			{
				if(M%j==0)
				{
					t = false; //소수가 아니다
				}
				
			}
			if(t) // 소수일때 
			{
				sum+=M;
				if(min==0)
				{
					min = M;
				}
			}
			
		}
		if(sum==0)
		{
			System.out.print(-1);
		}
		else
		{
			System.out.println(sum);
			System.out.println(min);
		}
	}
		
}


