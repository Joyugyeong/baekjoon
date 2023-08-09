
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
    	 int N = Integer.parseInt(br.readLine());
    	 
    	 int arr[][] = new int[N+1][3];
    	 int dp[][] = new int[N+1][3];
    	 int result[] = new int [N+1];
    	 
    	 
    	 for(int i = 1 ; i <= N ; i++) {
    		 StringTokenizer st = new StringTokenizer(br.readLine());
    		 arr[i][0] =Integer.parseInt(st.nextToken());
    		 arr[i][1] =Integer.parseInt(st.nextToken());
    		 arr[i][2] =Integer.parseInt(st.nextToken());
    	 }
    	 
    	 
    	 for(int i = 0 ; i < 3 ; i++) {
    		 for(int j = 0; j < 3 ; j++) {
    			 if(i == j) {
    				 dp[1][j] = arr[1][j];
    			 }
    			 else
                     dp[1][j] = 1001;
    		 }
    		 for(int k = 2 ; k <= N ; k++) {
    			 dp[k][0] = Math.min(dp[k-1][1], dp[k-1][2]) + arr[k][0];
        		 dp[k][1] = Math.min(dp[k-1][0], dp[k-1][2]) + arr[k][1];
        		 dp[k][2] = Math.min(dp[k-1][0], dp[k-1][1]) + arr[k][2];
        		 
        		 if(k==N) {
        			 if(i==0) {
        				 result[i] = Math.min(dp[N][1], dp[N][2]);
        			 }
        			 if(i==1) {
        				 result[i] = Math.min(dp[N][0], dp[N][2]);
        			 }
        			 if(i==2) {
        				 result[i] = Math.min(dp[N][0], dp[N][1]);
        			 }
        			 
        		 }
    		 }
    		 
    	 }
    	 
    	 
    	 System.out.print(Math.min(result[0],Math.min(result[1], result[2])));
    }
}