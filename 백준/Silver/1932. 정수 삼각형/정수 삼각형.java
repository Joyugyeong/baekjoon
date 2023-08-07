
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
    	 int N = Integer.parseInt(br.readLine());
    	 int arr [][] = new int[N+1][N+1];
    	 int dp [][] = new int[N+1][N+1];
    	 for(int i = 1; i <= N; i++) {
    		 StringTokenizer st = new StringTokenizer(br.readLine());
    		 for(int j = 1; j <= i ; j++) {
    			 arr[i][j]= Integer.parseInt(st.nextToken());
    		 }
    	 }
    	 for(int i = 1; i <= N; i++) {
    		 for(int j = 1; j <= i ; j++) {
    			 dp[i][j]= Math.max(dp[i-1][j-1], dp[i-1][j]) + arr[i][j];
    		 }
    	 }
    	 int answer = 0;
    	 for(int i = 1; i <= N; i++) {
    		if(dp[N][i] > answer) {
    			answer = dp[N][i];
    		}
    	 }
    	 
    	 System.out.print(answer);
    }
}