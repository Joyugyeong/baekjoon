
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	private static int m;
	private static ArrayList<Integer>[] list;
	private static int ans = 0;
	private static boolean[] v;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		m = M;
		
		//DFS를 위한 인접리스트 구현하기
		list = new ArrayList[N];
		v = new boolean[N];
		for(int i = 0; i < N; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			list[n1].add(n2);
			list[n2].add(n1);
		}
		
		//N-1까지의 모든 정점에서 DFS를 통해 확인
		for(int i = 0; i < N; i++) {
			if(ans == 0)
				dfs(i, 1);
		}
		
		System.out.println(ans);
	}
	
	public static void dfs(int start, int depth) {
		
		if(depth == 5) {
			ans = 1;
			return;
		}
		
		v[start] = true;
		for(int i : list[start]) {
			int next = i;
			if(!v[next]) {
				dfs(next, depth+1);
			}
		}
		v[start] = false;
	
	}
}