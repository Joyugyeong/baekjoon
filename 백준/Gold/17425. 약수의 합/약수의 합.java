
import java.io.*;
import java.util.*;
public class Main {
static int [][] dp;
static int [] arr;


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int count = Integer.parseInt(br.readLine());
		
		long fx[] = new long[1000001];
		long gn[] = new long[1000001];
		
		Arrays.fill(fx, 1);
		
		for(int i=2; i < fx.length ; i++) {
			for(int j=1; i*j < fx.length ; j++) {
				fx[i*j] += i;
			}
		}
		
		for(int i = 1; i < gn.length ; i++) {
			gn[i] = gn[i-1] + fx[i];
		}
		
		while(count-- > 0) {
			int input = Integer.parseInt(br.readLine());
			sb.append(gn[input]).append('\n');
		}
		
		System.out.println(sb);
	}
	
}