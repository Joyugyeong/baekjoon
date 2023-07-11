import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean arr[] = new boolean [1000001];
        arr[0] = arr[1] = true;
        for(int i = 2; i<arr.length ; i++) {
        	if(!arr[i]) {
        		for(int j = i + i ; j<arr.length ; j+=i) {
        			arr[j] = true;
        		}
        	}
        }
        
        int T = Integer.parseInt(br.readLine());
        
        int num[] = new int[T];
        for(int i = 0; i<T ; i++) {
        	num[i] = Integer.parseInt(br.readLine());
        }
        
        int count[] = new int [T];
        for(int i = 0; i<T ; i++) {
        	for(int j = 2; j <= num[i]/2 ; j++) {
        		if(!arr[j]&&!arr[num[i]-j]) {
        			count[i]++;
        		}
        	}
        }
        for(int i =0 ; i<T ; i++) {
        	System.out.println(count[i]);
        }
    }
    
}