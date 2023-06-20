
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	int n = Integer.parseInt(br.readLine());
    	Stack <Integer> st = new Stack<>();
    	
    	int start =0;
    	
    	while(n-->0) {
    		int value = Integer.parseInt(br.readLine());
    		
    		if(value>start) {
    			for(int i=start+1;i<=value;i++) {
    				st.push(i);
    				sb.append('+').append('\n');
    			}
    			start=value;
    		}
    		else if(st.peek() != value) {
				System.out.println("NO");
				return;		// 또는 System.exit(0); 으로 대체해도 됨. 
			}
			
			st.pop();
			sb.append('-').append('\n');
    	}
    	
    	System.out.println(sb);
    	
    }
}