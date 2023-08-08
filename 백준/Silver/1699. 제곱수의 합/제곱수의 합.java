
import java.io.*;
import java.util.*;
public class Main {
static int [] dp;
static int [] arr;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		dp = new int [N+1];
		dp[1] = 1;
		
		for(int i = 2; i<= N; i++) {
			dp[i] = i;
			for(int j = 1; j * j <= i ; j++) {
				dp[i] = Math.min(dp[i], dp[i - j*j] +1);
			}
		}
		System.out.print(dp[N]);
		
	}
	
}