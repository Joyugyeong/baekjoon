
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static class Step{
		int emotion_n;
		int board_n;
		int time;
		
		public Step(int emotion_n, int board_n, int time) {
			this.emotion_n  = emotion_n;
			this.board_n = board_n;
			this.time = time;
		}
	}
	static boolean [][] visited; 
	// 화면 이모티콘 수, 클립보드 이모티콘 수
	static int S;
	

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		S = Integer.parseInt(br.readLine());
		
		visited = new boolean[2001][2001];
		bfs();
		
		
		
	}
	public static void bfs() {
		Queue <Step> q = new LinkedList<>();
		q.add(new Step(1, 0, 0));
		while(!q.isEmpty()) {
			Step now = q.poll();
			
			int emotion_n = now.emotion_n;
			int board_n = now.board_n;
			int time = now.time;
			
			if(emotion_n == S) {
				System.out.println(time);
				return;
			}
			if(emotion_n > 0 && emotion_n<2000) {
				if(!visited[emotion_n][emotion_n]) {
					visited[emotion_n][emotion_n] = true;
					
					q.offer(new Step(emotion_n, emotion_n, time+1));
				}// 1. 복사
				if(!visited[emotion_n-1][board_n]) {
					visited[emotion_n-1][board_n] = true;
					
					q.offer(new Step(emotion_n-1, board_n, time+1));
				}// 3. 삭제
			} 
			if(board_n > 0 && emotion_n + board_n <2000) {
				if(!visited[emotion_n+board_n][board_n]) {
					visited[emotion_n+board_n][board_n] = true;
					
					q.offer(new Step(emotion_n+board_n, board_n, time+1));
				}
			}
			// 2. 붙여넣기
		}
		
		
	}
}