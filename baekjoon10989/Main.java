package baekjoon10989;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N =Integer.parseInt(bf.readLine());
		int arr [] =new int [N];
		for(int i=0;i<N;i++)
		{
			arr[i] = Integer.parseInt(bf.readLine());
		}
		Arrays.sort(arr);
		for(int i=0;i<N;i++)
		{
			sb.append(arr[i]).append('\n');
		}
		System.out.println(sb);
	}

}
