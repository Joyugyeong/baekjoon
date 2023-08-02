import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	static long MOD = 1000000000;
	
    public static void main(String[] args) throws IOException{
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
    	 int N = Integer.parseInt(br.readLine());
    	 
    	 long dp[][] = new long[N+1][10];
    	 
    	 for(int i = 1; i <=9 ; i++) {
    		 dp[1][i] = 1;
    	 }
    	 
    	 for(int i = 2; i <= N ; i++) {
    		 for(int j = 0; j < 10; j++) {
    			 if(j == 9) {
    				 dp[i][9] = dp[i-1][8] % MOD;
    			 }
    			 else if(j == 0) {
    				 dp[i][0] = dp[i-1][1] % MOD;
    			 }
    			 else
    				 dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % MOD;
    		 }
    	 }
    	 long answer = 0;
    	 for(int i = 0; i < 10 ; i++) {
    		 answer += dp[N][i];
    	 }
    	 
    	 System.out.print(answer%MOD);
    }
}