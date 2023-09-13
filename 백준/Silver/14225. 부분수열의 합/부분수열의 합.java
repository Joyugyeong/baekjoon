
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static int N;
	static int S[]; // 수열
	static boolean[] check = new boolean[2000001]; // 수열의 값들을 저장
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		S = new int[N];
		StringTokenizer st= new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			S[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0; i < N; i++) {
			dfs(i, S[i]);
		}
		int ans = 0;
		for(int i = 1; i< check.length; i++) {
			if(!check[i]) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}
	public static void dfs(int idx, int num) {
		check[num] = true;
		for(int i = idx +1 ; i < N; i++) {
			dfs(i, num + S[i]);
		}
	}
}