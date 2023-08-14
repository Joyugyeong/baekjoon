
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static int N;
	static int num[];
	static int sum[];
	static int result;
    public static void main(String[] args) throws IOException{
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
    	 N = Integer.parseInt(br.readLine());
    	 num = new int [] { 1, 5, 10, 50};
    	 sum = new int [10000];
    	 pick(0, 0, 0);
    	 System.out.print(result);
    }
    static void pick(int a, int b, int c) {
    	if(a == N) {
    		if(sum[c] == 0) {
    			sum[c] = 1;
    			result++;
    		}
    		return;
    	}
    	for(int i = b; i < 4 ; i++) {
    		pick(a + 1, i , c + num[i]);
    	}
    }
}