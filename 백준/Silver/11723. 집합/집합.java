
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		
		int s = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < M ; i++) {
			String str [] = br.readLine().split(" ");
			
			switch(str[0]) {
				case "all" :
					s = (1 << 21) - 1;
					break;
				case "empty" :
					s = 0;
					break;
				default :
					int x = Integer.parseInt(str[1]);
					switch(str[0]) {
					case "add" :
						s |= (1 << x);
						break;
					case "remove" :
						s &= ~(1 << x);
						break;
					case "toggle" :
						s ^= (1 << x);
						break;
					case "check" :
						sb.append((s & (1<<x)) != 0 ? 1 : 0).append('\n');
						break;
					}
				
			}
		}
		System.out.println(sb);
	}
}