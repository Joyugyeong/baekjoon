
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		int x = 0,y=0;
		
		loop:
			for(int i=-999;i<1000;i++) {
				for(int j=-999;j<1000;j++) {
					if((a*i+b*j==c)&&(d*i+e*j==f)) {
						x =i;
						y=j;
						break loop;
					}
				}
			}
		sb.append(x+" "+y);
		System.out.print(sb);
		br.close();
		
				
		
		
	}
	
}

