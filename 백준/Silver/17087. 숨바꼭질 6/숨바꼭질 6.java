
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        
        int arr[] = new int [N];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N ; i++) {
        	arr[i] = Math.abs(Integer.parseInt(st.nextToken()) - S);
        }
        
        int num = arr[0];
        
        for(int i = 1; i < N ; i++) {
        	num = gcd(num, arr[i]);
        }
        
        System.out.print(num);
        
       
    }
    public static int gcd(int x, int y) {
    	if(y==0) return x;
    	return gcd(y, x%y);
    }
    
    
    
    
}