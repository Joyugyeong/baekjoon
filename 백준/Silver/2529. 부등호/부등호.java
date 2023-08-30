
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	static int K;
	static boolean check[] = new boolean[10];
	static char signs[] = new char[10];
	static ArrayList<String> answer = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		K = Integer.parseInt(br.readLine());
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < K ; i++) {
			signs[i]= st.nextToken().charAt(0);
		}
		
		for(int i = 0 ; i < 10 ; i++) {
			check[i]=true; // 0 ~ 9
			dfs(i, 0, i +"");
		}
		System.out.println(answer.get(answer.size()-1)); // 최댓값
		System.out.println(answer.get(0)); // 최솟값
	}
	
	public static void dfs(int num, int idx, String str) {
		if(idx == K) {
			answer.add(str);
		} else {
			for(int i = 0 ; i < 10 ; i++) {
				if(!check[i]) {
					if(signs[idx] == '<') {
						if(num >= i) continue;
					} else {
						if(num <=i) continue;
					}
					check[i] = true;
					dfs(i, idx+1, str+i);
				}
			}
			
		}
		check[num] = false; // 번호 중복 방지
	}
	
	
}