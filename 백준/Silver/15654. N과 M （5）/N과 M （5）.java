
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static int [] arr;
	static int [] num;
	static boolean [] check;
	static int N;
	static int M;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		num = new int [N];
		check = new boolean [N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num);
		arr = new int [M];
		
		
		dfs(1,0);
		System.out.println(sb);
		
    }
    public static void dfs(int start, int depth) {
    	
    	if(depth == M) {
    		for(int val : arr) {
    			sb.append(val).append(' ');
    		}
    		sb.append('\n');
    		return;
    	}
    	
    	for(int i = 0 ; i < N ;i++) {
    		if(check[i]==false) {
    			check[i] = true;
        		arr[depth] = num[i];
        		dfs(i + 1 , depth+1);
        		check[i]  = false;
    		}
    		
    	}
    	return;
    }
}