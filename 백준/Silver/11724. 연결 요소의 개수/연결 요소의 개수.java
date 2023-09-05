
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	
	static int[][] check;
	static boolean [] checked;
	static int N;
	static int M;
	static int count;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken()); // 정점의 개수
		M = Integer.parseInt(st.nextToken()); // 간선의 개수
		
		check = new int [N+1][N+1];
		checked = new boolean[N+1];
		
		for(int i = 0; i < M ; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			check[x][y] = check[y][x] = 1; 
			// 무방향 그래프 특성
		}
		count = 0 ;
		for(int i =1 ; i <= N; i++) {
			if(checked[i]==false) {
				dfs(i);
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void dfs(int start) {
		if(checked[start] == true) {
			return;
		}
		checked[start] = true;	
		for(int i = 1; i<=N ; i++) {
			if(check[start][i] == 1) {
				dfs(i);
			}
		}
		
	}
}