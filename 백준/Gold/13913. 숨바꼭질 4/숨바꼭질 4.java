
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	
	static int [] check; // 방문여부
	static int [] before; // 이전 값 저장
	static StringBuilder sb;
	static int N;
	static int K;

	static int count;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		if(N==K) {
			System.out.println(0);
			System.out.println(N);
		}else {
			before = new int[100001];
			check = new int[100001];
			bfs();
			sb.append(check[K]+"\n");
			Stack<Integer>  s = new Stack<>();
			int after = K; // 마지막값 부터
			while (after!=N) { 
				s.push(after); // 반대로 스택에 넣기
				after = before[after]; // after 값의 과정 전 값
			}
			s.push(N); // 시작점값 넣기
			
			while(!s.isEmpty()) { // 반대로 출력
				sb.append(s.pop()).append(" ");
			}
			System.out.println(sb);
		}
		
	}
	public static void bfs() {
		Queue <Integer> q = new LinkedList<>();
		q.add(N);
		
		while(!q.isEmpty()) {
			int x = q.poll();
			if(x == K ) break;
			if(x > 0 && check[x-1] ==0 ) {
				q.add(x-1);
				check[x-1] = check[x] + 1;
				before[x-1] = x; 
			}
			if(x+1 <=100000 && check[x+1] ==0) {
				q.add(x+1);
				check[x+1] = check[x] + 1;
				before[x+1] = x;
			}
			if(x * 2 <= 100000 && check[x*2] ==0) {
				q.add(x*2);
				check[x*2] = check[x] +1;
				before[x*2] = x;
			}
		}
		
	}
}