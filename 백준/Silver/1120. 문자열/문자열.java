
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String A = st.nextToken();
		String B = st.nextToken();
		int answer = A.length();
		
		for(int i = 0; i <= B.length() - A.length(); i++) {
			int cnt = 0;
			for(int j = 0; j < A.length(); j++) {
				if(A.charAt(j) != B.charAt(i + j)) {
					cnt++;
				}
			}
			answer = Math.min(cnt, answer);
		}
		System.out.println(answer);
	}
	
}
