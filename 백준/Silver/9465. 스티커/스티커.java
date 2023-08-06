
import java.io.*;
import java.util.*;
public class Main {
static int [][] dp;
static int [][] arr;
static int N;
static int MOD = 10007;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		while(T--!=0) {
			N = Integer.parseInt(br.readLine());
			
			arr = new int[2][N+1];
			dp = new int [2][N+1];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 1 ; i <=N ; i++) {
				arr[0][i] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			for(int i = 1 ; i <=N ; i++) {
				arr[1][i] = Integer.parseInt(st.nextToken());
			}
			
			dp[0][1] = arr[0][1];
			dp[1][1] = arr[1][1];
			
			for(int i = 2 ; i <= N ; i++) {
				dp[0][i] = Math.max(dp[1][i - 1], dp[1][i - 2]) + arr[0][i];
                dp[1][i] = Math.max(dp[0][i - 1], dp[0][i - 2]) + arr[1][i];
			}
			
			System.out.println(Math.max(dp[0][N], dp[1][N]));
			
		}
		
		
	}
	
}