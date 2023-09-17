
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static int N, M;
	static int arr [];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		M = Integer.parseInt(br.readLine());
		N = Integer.parseInt(br.readLine());
		
		int min = (int)Math.ceil(Math.sqrt(M));
		int sum = 0;
		for(int i = min; i <= Math.floor(Math.sqrt(N)); i++) {
			sum += Math.pow(i, 2);
		}
		
		if(sum > 0) {
			System.out.println(sum);
			System.out.println((int)Math.pow(min, 2));
			
		}else System.out.println(-1);
	}
	
}
