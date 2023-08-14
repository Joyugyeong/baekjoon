
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
    	 StringTokenizer st = new StringTokenizer(br.readLine());
    	 
    	 int A = Integer.parseInt(st.nextToken());
    	 int B = Integer.parseInt(st.nextToken());
    	 int C = Integer.parseInt(st.nextToken());
    	 int X = Integer.parseInt(st.nextToken());
    	 int Y = Integer.parseInt(st.nextToken());
    	 
    	 int sum = 0;
    	 
    	 if(A + B <= C * 2) {
    		 sum += (A * X) + (B * Y);
    	 }
    	 else {
    		 if(X > Y) {
    			 sum += Y * (C * 2);
    			 sum += Math.min((X - Y) * A, (X - Y) * C * 2);
    		 } else if(X < Y) {
    			 sum += X * (C * 2);
    			 sum += Math.min((Y - X) * B, (Y - X) * C * 2);
    		 }
    	 }
    	 
    	 System.out.print(sum);
    }
}