
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        
        boolean arr[] = new boolean[1000001];
        arr[0]=arr[1]=true;
        for(int i = 2; i<arr.length;i++) {
        	if(!arr[i]) {
        		for(int j=i+i;j<arr.length;j+=i) {
        			arr[j]=true;
        		}
        	}
        }
        int N = Integer.parseInt(br.readLine());
          
        while(N!=0) {
        	boolean check = false;
        	for(int i=2;i<=N/2;i++) {
        		if(!arr[i]&&!arr[N-i]) {
        			System.out.println(N+" = "+i+" + "+(N-i));
        			check = true;
        			break;
        		}
        	}
        	StringBuilder sb2 = new StringBuilder();
            if(!check) {
            	System.out.println("Goldbach's conjecture is wrong.");
            }
            N = Integer.parseInt(br.readLine());
        }
        
    }
}