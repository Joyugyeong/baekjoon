package baekjoon10870;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int result =0;
		Scanner s = new Scanner(System.in);
		int arr [] = new int[21];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<21;i++)
		{
			arr[i] = arr[i-2] + arr[i-1];
		}
		num = s.nextInt();
		System.out.print(arr[num]);
		
	}

}
