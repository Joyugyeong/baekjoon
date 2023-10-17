
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0;
		int N = 0;
		for(int i = 0; i < 5 ; i++) {
			N = Integer.parseInt(br.readLine());
			if(N < 40) {
				sum += 40;
			}
			else {
				sum += N;
			}
		}
		System.out.println(sum/5);
	}
	
}
