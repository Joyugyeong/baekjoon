import java.io.*;
import java.util.*;
public class Main {
static int [] dp;
static int [] arr;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		arr = new int [N+1] ;
		dp = new int [N+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1 ; i <= N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp[i] = 1;
		}
		int max = 1;
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j<i ; j++) {
				if(arr[i] < arr[j]) {
					dp[i] = Math.max(dp[j]+1, dp[i]);
					max = Math.max(max, dp[i]);
				}
			}
		}
		System.out.print(max);
	}
	
}