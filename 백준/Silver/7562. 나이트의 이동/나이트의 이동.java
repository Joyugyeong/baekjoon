
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	
	static int [][] arr; // 받을배열
	static boolean [][] visited; // 방문여부
	static int x1, x2, y1, y2;
	static int K;
	static int N;
    
	static int [] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
	static int [] dy = {-2, -1, 1, 2, 2, 1, -1, -2};
	// 색칠된 좌표
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		K = Integer.parseInt(br.readLine());
		while(K--!=0) {
			N = Integer.parseInt(br.readLine());
			arr = new int [N][N];
			visited = new boolean[N][N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			
			bfs();
			sb.append(arr[x2][y2]).append('\n');
		}
		System.out.println(sb);
		
	}
	public static void bfs() {
		Queue <int[]> q= new LinkedList<>();
		// 객체 타입에 사용할 형태 넣기
		q.add(new int[] {x1, y1});
		// 첫 번째 좌표
		visited[x1][y1] = true;
		// 첫 번째 좌표 방문처리
		while(!q.isEmpty()) {
			int [] now = q.poll();
			int nx = now[0];
			int ny = now[1];
			for(int i = 0; i < 8 ; i++) {
				int ox = nx + dx[i];
				int oy = ny + dy[i];
				
				if(ox >=0 && ox < N && oy >=0 && oy < N ) {
					if(!visited[ox][oy]) {
						q.add(new int[] {ox, oy});
						// 다음 값 큐에 넣기
						arr[ox][oy] = arr[nx][ny] +1;
						// 횟수 추가
						visited[ox][oy] = true;
						//방문처리
					}
					
				}
			}
		}
	}
}