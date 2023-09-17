
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static int N;
	static ArrayList<Integer> list = new ArrayList<>();
	static ArrayList<Integer> result = new ArrayList<>();
	static int max = Integer.MIN_VALUE;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st= new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		dfs(0);
		
		System.out.println(max);
		
	}
	public static void dfs(int sum) {
		if(list.size() ==2) {
			max = Math.max(max, sum);
			return;
		}
		for(int i = 1; i < list.size()-1 ; i++) {
			int temp = list.get(i);
			int num = list.get(i-1) * list.get(i+1);
			list.remove(i);
			dfs(sum + num);
			list.add(i, temp); // i 인덱스에 temp값 복구
		}
	}
}
