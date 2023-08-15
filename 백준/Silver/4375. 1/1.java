
import java.io.*;
import java.util.*;
public class Main {
static int [][] dp;
static int [] arr;
static long MOD = 1000000000;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			if(s==null) break;
			int N = Integer.parseInt(s);
			
			int num = 0;
			for(int i = 1; i <= N; i++) {
				num = (num * 10) + 1;
				num = num % N;
				if(num == 0) {
					System.out.println(i);
					break;
				}
			}
		}
		
	}
	
}