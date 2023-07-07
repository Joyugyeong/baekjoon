import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int T = Integer.parseInt(st.nextToken());
        	long sum = 0;
        	
        	int arr[] = new int [T];
        	
        	for(int i = 0; i < T; i++) {
        		arr[i] = Integer.parseInt(st.nextToken());
        	}
        	for(int i = 0; i < T-1; i++) {
        		for(int j = i+1; j < T; j++) {
            		sum += gcd(arr[i] , arr[j]);
            	}
        	}
        	System.out.println(sum);
        	sum = 0;
        }
        
        
       
    }
    
    static int gcd(int x, int y) {
    	if(x % y ==0) {
    		return y;
    	}
    	return gcd(y , x%y);
    }
    
    
}