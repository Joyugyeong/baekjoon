
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	
	static int N;

	static boolean check[];
	static int arr[];
	static int result = Integer.MIN_VALUE;
	static int num[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine()); 
		arr= new int [N];
		num= new int [N];
		check = new boolean[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0);
		System.out.println(result);
		
	}
	public static void dfs(int depth) {
		if(depth==N) {
			result = Math.max(result, getResult());
		}
		for(int i = 0; i< N ; i++) {
			if(!check[i]) {
				check[i] = true;
				num[depth] = arr[i];
				dfs(depth+1);
				
				check[i] = false;
				
			}
		}
	}
	
	public static int getResult() {
		int sum = 0;
		for(int i = 0 ; i < num.length-1 ; i++) {
			sum += Math.abs(num[i]-num[i+1]);
		}
		return sum;
	}
	
	
}