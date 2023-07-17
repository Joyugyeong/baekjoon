
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] dp = new int[11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        int T = Integer.parseInt(br.readLine());
        
        while(T-->0) {
        	int N = Integer.parseInt(br.readLine());
        	
        	for(int i = 4; i <=N ; i++) {
            	dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
            }
            
            System.out.println(dp[N]);
        }
        
    }
    
}