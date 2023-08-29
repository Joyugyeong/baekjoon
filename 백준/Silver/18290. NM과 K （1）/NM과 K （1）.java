
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static int [][] check; // 인접한 값 확인
	static int [] list; // 더한 값 저장
	static int [][] arr; 
	static int N;
	static int M;
	static int K;
	static int max = -10000;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		arr = new int [N][M];
		check = new int [N][M];
		list = new int [K];
		
		for(int i = 0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < M ; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(0);
		System.out.println(max);
		
    }
    public static void dfs(int start) {
    	if(start == K) {
    		int temp = 0;
    		for(int i : list) {
    			temp += i;
    		}
    		max = Math.max(max, temp);
    	} else {
    		for(int i = 0 ; i < N ; i++) {
    			for(int j = 0 ; j < M ; j++) {
    				if(check[i][j] > 0) {
    					continue;
    				}
    				go(i, j);
    				list[start] = arr[i][j]; // 현재값 넣기
    				dfs(start + 1); // 재귀
    				back(i, j);
    			}
    		}
    	}
    }
    public static void go(int a, int b) {
    	check[a][b]++;
    	if(b - 1 >=0) { // 위가 존재할때
    		check[a][b-1]++;
    	}
    	if(b + 1 <M) { // 아래가 존재할때
    		check[a][b+1]++;
    	}
    	if(a - 1 >=0) { // 왼쪽이 존재할때
    		check[a-1][b]++;
    	}
    	if(a + 1 <N) { // 오른쪽이 존재할때
    		check[a+1][b]++;
    	}
    }
    
    public static void back(int a, int b) { // 원상복귀
    	check[a][b]--;
    	if(b - 1 >=0) { 
    		check[a][b-1]--;
    	}
    	if(b + 1 <M) { 
    		check[a][b+1]--;
    	}
    	if(a - 1 >=0) { 
    		check[a-1][b]--;
    	}
    	if(a + 1 <N) { 
    		check[a+1][b]--;
    	}
    }
}