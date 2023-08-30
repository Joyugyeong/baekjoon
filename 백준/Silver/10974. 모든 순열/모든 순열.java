
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	
	static int N;

	static boolean check[];
	static int arr[];
	static int result[];
	static StringBuilder sb;
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine()); 
		arr= new int [N];
		result= new int [N];
		check= new boolean [N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = i+1;
		}
		dfs(0);
		
	}
	public static void dfs(int depth) {
		if(depth == N) {
			for(int val : result) {
				System.out.print(val +" ");
			}
			System.out.println();
		}
		for(int i = 0 ; i < N ; i++) {
			if(!check[i]) {
				check[i] = true;
				result[depth] = arr[i];
				dfs(depth+1);
				check[i] = false;
			}
			
		}
		
	}
	
}