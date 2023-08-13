
import java.io.*;
import java.util.*;
public class Main {
static int [][] dp;
static int [] arr;
static long MOD = 1000000000;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = new String();
		s = br.readLine();
		int sum = 1;
		
		for(int i = 0 ;i < s.length() ; i++) {
			int cases = s.charAt(i) == 'c' ? 26 : 10;
			if(i > 0 && s.charAt(i) == s.charAt(i-1)) {
				cases--;
			}
			sum *= cases;
		}
		System.out.println(sum);
	}
	
}