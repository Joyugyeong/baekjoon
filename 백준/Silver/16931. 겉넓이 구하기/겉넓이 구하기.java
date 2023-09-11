
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static int[] dx = {-1, 0 , 1, 0};
    static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int result = 0;
		int arr [][] = new int [N][M];
		for(int i = 0; i < N; i++) {
			st= new StringTokenizer(br.readLine());
			for(int j = 0 ; j < M ; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		result += N * M * 2 ; // 상, 하면
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0; j < M ; j++) {
				for(int k = 0; k < 4; k++) {
					int x = i + dx[k];
					int y = j + dy[k];
					
					if(x<0 || y<0 || x>N-1 || y>M-1) {
						result += arr[i][j];
						continue;
					}
					if(arr[x][y]<arr[i][j]) {
						result += arr[i][j] - arr[x][y];
					}
				}
			}
		}
		
		System.out.println(result);
	}
	
}