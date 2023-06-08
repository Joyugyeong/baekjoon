
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	while(true) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken());
    		int b = Integer.parseInt(st.nextToken());
    		int c = Integer.parseInt(st.nextToken());
    		if(a==0||b==0||c==0) {break;}
    		int max = Math.max(Math.max(a, b), c);
    		if(max==a) {
    			int sum = b+c;
    			if(max>=sum){
    				System.out.println("Invalid");continue;
    			}
    		}
    		if(max==b) {
    			int sum = a+c;
    			if(max>=sum){
    				System.out.println("Invalid");continue;
    			}
    		}
    		if(max==c) {
    			int sum = b+a;
    			if(max>=sum){
    				System.out.println("Invalid");continue;
    			}
    		}
    		if(a==b&&a==c&&b==c) {
    			System.out.println("Equilateral");continue;
    		}
    		else if(a==b||a==c||b==c) {
    			System.out.println("Isosceles");continue;
    		}
    		else {
    			System.out.println("Scalene");continue;
    		}
    		
    	}
    	
    }
}