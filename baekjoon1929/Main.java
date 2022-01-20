package baekjoon1929;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int M = s.nextInt();
		int N = s.nextInt();
		boolean arr[] = new boolean[N+1];
		arr[0]=true;
		arr[1]=true;
		for(int i=2;i<=N;i++)
		{
			if(arr[i]==true)
				{continue;}
			for(int j=i+i;j<=N;j=j+i)
			{
				arr[j]=true;
			}
		}
		for(int i=M;i<=N;i++)
		{
			if(arr[i]==false)
			{
				System.out.println(i);
			}
		}
		
		
	}

}
