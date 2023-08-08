
import java.io.*;
import java.util.*;
public class Main {
static int [] dp;
static int [] arr;
static int MOD = 1000000000;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int X = Integer.parseInt(br.readLine());
		
		dp = new int[X+1];
		dp[0] = dp[1] = 0;
		
		for(int i = 2 ; i<= X ; i++) {
			dp[i] = dp[i-1]+1;
			if(i % 2 == 0) dp[i] = Math.min(dp[i], dp[i/2] + 1);
			if(i % 3 == 0) dp[i] = Math.min(dp[i], dp[i/3] + 1);
		}
		System.out.println(dp[X]);
	}
	
}