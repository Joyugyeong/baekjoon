
import java.io.*;
import java.util.*;
public class Main {
static int [][] dp;
static int [][] arr;

static int MOD = 9901;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		dp = new int[N+1][3];
		dp[1][0] = 1;
		dp[1][1] = 1;
		dp[1][2] = 1;
		
		for(int i = 2; i <= N ; i++) {
			dp[i][0] = (dp[i-1][0] + dp[i-1][1] + dp[i-1][2]) % MOD;
			dp[i][1] = (dp[i-1][0] + dp[i-1][2]) % MOD;
			dp[i][2] = (dp[i-1][0] + dp[i-1][1]) % MOD;
		}
		
		System.out.print((dp[N][0]+dp[N][1]+dp[N][2])%MOD);
		
	}
}