
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long N = Long.parseLong(st.nextToken());
        Long M = Long.parseLong(st.nextToken());
        
        long count5 = five_power(N) - five_power(N - M) - five_power(M);
        long count2 = two_power(N) - two_power(N - M) - two_power(M);
        System.out.print(Math.min(count5, count2));
    }
    
    static long five_power(long num) {
    	int count = 0;
    	
    	while(num >= 5 ) {
    		count += (num / 5);
    		num /= 5;
    	}
    	return count;
    }
    
    static long two_power(long num) {
    	int count = 0;
    	
    	while(num >= 2 ) {
    		count += (num / 2);
    		num /= 2;
    	}
    	return count;
    }
}