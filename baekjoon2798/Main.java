package baekjoon2798;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int result =0;
		int arr[] = new int [N];
		for(int i=0;i<N;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<N-2;i++)
		{
			for(int j=i+1;j<N-1;j++)
			{
				for(int z=j+1;z<N;z++)
				{
					int temp = arr[i]+arr[j]+arr[z];
					if(M==temp)
					{
						result = temp;
						break;
					}
					else if(result<temp && temp<M)
					{
						result = temp;
					}
				}
			}
		}
	
		System.out.println(result);
	}

}
