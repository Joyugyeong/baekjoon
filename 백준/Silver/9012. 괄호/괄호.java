
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum =0;
		for(int i=0;i<N;i++) {
			String s = br.readLine();
			for(int j=0;j<s.length();j++) {
				if(sum<0) break;
				if(s.charAt(j)=='(') {
					sum++;
				}
				else {
					sum--;
				}
			}
			if(sum==0) {
				System.out.println("YES");
				sum=0;
			}
			else {
				System.out.println("NO");
				sum=0;
			}
		}
		
	}
}

