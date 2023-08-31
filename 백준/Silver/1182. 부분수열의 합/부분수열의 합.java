
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static int N;
	static int S;
	static int arr [];
	static int num [];
	static int count;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		
		arr = new int [N];
		num = new int [N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		dfs(0,0);
		System.out.println(S == 0 ? count -1 : count);
		// 공집합인 경우 제외 
	}
	static void dfs (int idx, int sum) {
		if(idx == N) {
			if(sum == S) {
				count++;
			}
			return;
		}
		dfs(idx+1 , sum + arr[idx]); // 원소 선택했을 때 값 넘기기 
		dfs(idx+1, sum); // 원소 선택하지 않고 값 넘기기 
		
		// 두 값을 합쳤을 때 S가 되면 count++
	}
}