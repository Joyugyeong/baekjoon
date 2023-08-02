
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static long dp[][];
    public static void main(String[] args) throws IOException{
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
    	 dp= new long[91][2];
    	 
    	 dp[1][0] = 0;
    	 dp[1][1] = 1;
    	 
    	 int N = Integer.parseInt(br.readLine());
    	 for(int i = 2 ; i <= N ; i++) {
    		 
    		 dp[i][0] = dp[i-1][0] + dp[i-1][1];
    		 dp[i][1] = dp[i-1][0];
    		 
    	 }
    	 
    	 
    	System.out.print(dp[N][0]+dp[N][1]);
    }
}