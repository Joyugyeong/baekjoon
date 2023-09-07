import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	
	static int [] arr; // 받을배열
	static boolean [] visited; // 방문여부
	
	static int N;
	static int K;

	static int count;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		if (N == K) {
            System.out.println(0);
            return;
        }
		visited = new boolean[100001];
		bfs();
		
		
		
	}
	public static void bfs() {
		Queue <Integer> q = new LinkedList<>();
		q.add(N);
		while(true) {
			count++;
			int size = q.size();
			for(int i = 0; i < size ; i++) {
				int num = q.remove();
				visited[num] = true;
				if(num-1 == K || num+1 == K || num*2 ==K) {
					System.out.println(count);
					System.exit(0);
				}
				if(num +1 <= 100000 && !visited[num+1]) {
					visited[num+1] = true;
					q.add(num+1);
				}
				if(num -1 >= 0 && !visited[num-1]) {
					visited[num-1] = true;
					q.add(num-1);
				}
				if(num *2 <= 100000 && !visited[num*2]) {
					visited[num*2] =true;
					q.add(num*2);
				}
				
			}
		}
		
	}
}