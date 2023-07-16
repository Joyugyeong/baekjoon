
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int m = Integer.parseInt(br.readLine());
		
		int arr[] = new int [m];
		ArrayList <Integer> list = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		
		int sum = 0;
		for(int i = 0 ; i < m ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i] * Math.pow(A, (m-1-i));
		}
		while(sum!=0) {
			list.add(sum%B);
			sum = sum / B;
		}
		for(int i = list.size()-1; i >= 0 ; i--) {
			System.out.print(list.get(i)+" ");
		}
		
	}
}

