package baekjoon4948;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while(true) {
		int N = s.nextInt(); // 입력
		if(N==0)
		{
			break;
		}
		boolean arr[] = new boolean[2*N+1];
		arr[0]=true;
		arr[1]=true;
		for(int i=2;i<=2*N+1;i++)
		{
			for(int j=i+i;j<2*N+1;j=j+i)
			{
				arr[j]=true;
			}
		}
		int count =0; // 소수개수
		for(int i = N+1;i<2*N+1;i++)
		{
			if(arr[i]==false)
			{
				count +=1;
			}
		}
		System.out.println(count);
		
		
		}
	}

}
