
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		int t[] = new int [N];
		int p[] = new int [N];
		
		for(int i = 0 ; i < N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			t[i] = Integer.parseInt(st.nextToken());
			p[i] = Integer.parseInt(st.nextToken());
		}
		int dp[] = new int [N+1];
		
		for(int i = 0 ; i < N ; i++) {
			if(i + t[i] <= N) {
				dp[i + t[i]] =Math.max(dp[i + t[i]], dp[i] + p[i]);
			}
			
			dp[i + 1] = Math.max(dp[i+1], dp[i]);
		}
		System.out.println(dp[N]);
    }
}