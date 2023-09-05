
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	
	static int[][] check;
	static boolean [] checked;
	static int N;
	static int M;
	static int V;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		check = new int [1001][1001];
		checked = new boolean[1001];
		
		for(int i = 0; i < M ; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			check[x][y] = check[y][x] = 1; // 양방향
		}
		dfs(V);
		
		checked = new boolean[1001];
		System.out.println();
		
		bfs();
	}
	
	public static void dfs(int i) {
		checked[i] = true;
		System.out.print(i + " ");
		
		for(int j = 1 ; j <= N; j++) {
			if(check[i][j] == 1 && checked[j] == false) {
				dfs(j);
			}
		}
	}
	
	
	public static void bfs() {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(V);
		checked[V] = true;
		System.out.print(V + " ");
		
		while(!q.isEmpty()) {
			int num = q.poll();
			
			for(int j = 1 ; j <= N; j++) {
				if(check[num][j] == 1 && checked[j]==false) {
					q.offer(j);
					checked[j] = true;
					System.out.print(j+" ");
				}
			}
		}
	}
}