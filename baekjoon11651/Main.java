package baekjoon11651;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int arr[][] = new int [N][2];
		for(int i=0;i<N;i++)
		{
			arr[i][1]=s.nextInt();
			arr[i][0]=s.nextInt();
		}
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int e1[], int e2[])
			{
				if(e1[0]==e2[0])
				{
					return e1[1]-e2[1];
				}
				else
					return e1[0]-e2[0];
			}
		});
		for(int i=0;i<N;i++)
		{
			System.out.print(arr[i][1]+" ");
			System.out.println(arr[i][0]);
		}
	}

}
