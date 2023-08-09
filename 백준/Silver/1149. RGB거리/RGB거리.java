
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
    	 int N = Integer.parseInt(br.readLine());
    	 
    	 int arr[][] = new int[N+1][3];
    	 int dp[][] = new int[N+1][3];
    	 
    	 
    	 
    	 for(int i = 1 ; i <= N ; i++) {
    		 StringTokenizer st = new StringTokenizer(br.readLine());
    		 arr[i][0] =Integer.parseInt(st.nextToken());
    		 arr[i][1] =Integer.parseInt(st.nextToken());
    		 arr[i][2] =Integer.parseInt(st.nextToken());
    	 }
    	 for(int i = 1 ; i <= N ; i++) {
    		 dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + arr[i][0];
    		 dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + arr[i][1];
    		 dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + arr[i][2];
    	 }
    	 
    	 System.out.print(Math.min(dp[N][0],Math.min(dp[N][1], dp[N][2])));
    }
}