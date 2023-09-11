
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		
		int [][] B = new int[H + X][W + Y];
		for(int i = 0; i < B.length; i++) {
			st= new StringTokenizer(br.readLine());
			for(int j = 0 ; j < B[0].length; j++) {
				B[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int [][] A = new int [H][W];
		for(int i = 0; i < B.length; i++) {
			for(int j = 0; j < B[0].length; j++) {
				if(i < X && j < W) {
					A[i][j] = B[i][j];
				}else if(j < Y && i < H) {
					A[i][j] = B[i][j];
				}else if(j >= Y && i >= X && j < W && i < H) {
					A[i][j] = B[i][j] - A[i-X][j-Y];
				}
			}
		}
		for(int i = 0; i < H ; i++) {
			for(int j = 0 ; j < W ; j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}