
import java.io.*;
import java.util.*;
public class Main {
static int [][] dp;
static int [] arr;


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long sum = 0;
		for(int i = 1; i<=N; i++) {
			sum += i * (N/i);
		}
		System.out.print(sum);
		
	}
	
}