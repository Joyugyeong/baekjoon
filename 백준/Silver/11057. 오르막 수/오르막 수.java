
import java.io.*;
import java.util.*;
public class Main {
static int [][] dp;

static int MOD = 10007;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		dp = new int[N+1][10];
		
		for(int i = 0; i < 10 ; i ++ ) {
			dp[1][i] = 1;
		}
		
		for(int i = 2 ; i<=N ; i++) {
			for(int j = 0 ; j<10 ; j++) {
				for(int k = j ; k <10; k++) {
					dp[i][j] += dp[i-1][k];
					dp[i][j] %=MOD;
				}
			}
		}
		int sum = 0;
		for(int i =0; i <=9 ; i++) {
			sum += dp[N][i];
			sum %=MOD;
		}
		System.out.print(sum);
	}
}