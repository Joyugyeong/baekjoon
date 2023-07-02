
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		System.out.println(gcd(a,b));
		System.out.println(a*b/gcd(a,b));
		
	}
	public static int gcd(int x,int y) {
		if(y==0) return x;
		return gcd(y, x%y);
	}
}

