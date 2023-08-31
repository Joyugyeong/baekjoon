
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	
	static int K;

	static boolean check[];
	static int arr[];
	static StringBuilder sb;
	static int num[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		while(true) {
			String s = br.readLine();
			if(s.equals("0"))break;
			String [] str = s.split(" ");
			K = Integer.parseInt(str[0]);
			arr= new int [K];
			check = new boolean[K];
			for(int i = 0; i < K; i++) {
				arr[i] = Integer.parseInt(str[i+1]);
			}
			dfs(0,0);
			System.out.println();
		}
			
	}
	public static void dfs(int start,int depth) {
		if(depth == 6) {
			for(int i = 0 ; i < K ; i++) {
				if(check[i]) {
					System.out.print(arr[i]+" ");
				}
			}
			System.out.println();
		}
		for(int i = start; i < K ; i++) {
			check[i] = true;
			dfs(i + 1, depth+1);
			check[i] = false;
				
			
		}
	}

}