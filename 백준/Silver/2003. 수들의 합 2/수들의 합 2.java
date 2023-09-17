
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static int N, M;
	static int arr [];
	static int count = 0;
	static int sum = 0;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		
		st= new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		System.out.println(twoPointer());
	}
	static int twoPointer() {
		int s = 0; // start
		int e = 0; // end
		int sum = 0;
		while (true) {
			if(sum >= M) { // 구하는 값보다 크다면 앞 인덱스에서 당겨주기
				sum -= arr[s++];
			}
			else if(e >= arr.length) {
				break;
			}
			else { // 구하는 값보다 작다면 뒤 인덱스로 밀어주기
				sum += arr[e++];
			}
			if(sum==M) {
				count++;
			}
		}
		return count;
	}
}
