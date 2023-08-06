import java.io.*;
import java.util.*;
public class Main {
	static final long MOD = 1000000009;
	static final int MAX = 1000001;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		long[] dp = new long [MAX]; 
		
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i = 4; i < MAX ; i++) {
			dp[i] = (dp[i-1] + dp[i-2] + dp[i-3]) % MOD;
		}
		while(T--!=0) {
			int N = Integer.parseInt(br.readLine());
			
			System.out.println(dp[N]% MOD);
		}
		
	}
	
}