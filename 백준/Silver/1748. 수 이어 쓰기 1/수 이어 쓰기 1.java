
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int num = 10 ;
		int answer = 0;
		int plus = 1;
		for(int i = 1; i <= N ; i++) {
			if(i % num ==0) {
				plus++;
				num *= 10;
			}
			answer += plus;
		}
		
		
		System.out.println(answer);
    }
    
}