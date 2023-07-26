
import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int arr [] = new int [N+1];
		int d[] = new int[N+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			d[i] = Integer.MAX_VALUE;
		}
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <=i ; j++) {
				d[i] = Math.min(d[i], d[i - j] + arr[j]);
			}
		}
		
		System.out.println(d[N]);
		
	}
}

