
import java.io.*;
import java.util.*;
public class Main {
static int [][] dp;
static int [] arr;
static long MOD = 1000000000;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList <Integer> list = new ArrayList<>();
		for(int i = 0 ; i < N ; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list);
		System.out.println(list.get(0)*list.get(N-1));
		
	}
	
}