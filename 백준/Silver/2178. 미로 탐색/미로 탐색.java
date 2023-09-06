
import java.io.*;
import java.math.*;
import java.util.*;
class Location{
	int row, col;
	public Location(int row, int col) {
		this.row = row;
		this.col = col;
	} // 행, 열 값 저장위해서
}
public class Main {
	
	static int [][] arr; // 받을배열
	static int [][] visited; // 방문여부
	static int N;
	static int M;
	// 상좌하우
	static int [] dx = { -1, 0, 1, 0};
	static int [] dy = { 0, -1, 0, 1};
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); 
		M = Integer.parseInt(st.nextToken()); 
		
		arr = new int[N+1][M+1];
		visited = new int [N+1][M+1];
		
		for(int i = 1 ; i <= N ; i++) {
			String s = br.readLine();
			for(int j = 1; j <= M ; j++) {
				arr[i][j] = (int)s.charAt(j-1) -'0';
			}
		}
		bfs();
		
		
	}
	
	public static void bfs() {
		Queue<Location> q = new LinkedList<>();
		q.add(new Location(1,1));
		visited[1][1] = 1;
		while(!q.isEmpty()) {
			Location l = q.poll();
			int row = l.row;
			int col = l.col;
			for(int i = 0; i < 4 ; i ++) {
				int x = row + dx[i];
				int y = col + dy[i];
				if(checked(x, y)) {
					q.add(new Location(x,y));
					visited[x][y] = visited[row][col] + 1;
				}
			}
			
		}
		System.out.println(visited[N][M]);
	}
	
	public static boolean checked(int r, int c) {
		if(r < 1 || r > N || c < 1 || c > M) {
			return false;
		}
		if(visited[r][c] !=0 || arr[r][c] == 0) {
			return false;
		}
		return true;
	}
	
}