
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		String str = br.readLine();
		Stack<Character> l_stack = new Stack<>();
		Stack<Character> r_stack = new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			l_stack.push(str.charAt(i));
		}
		int N = Integer.parseInt(br.readLine());
		while(N-->0) {
			String s = br.readLine();
			switch(s.charAt(0)) {
			case 'L':
				if(l_stack.empty()) break;
				r_stack.push(l_stack.pop());
				break;
			case 'D':
				if(r_stack.empty()) break;
				l_stack.push(r_stack.pop());
				break;
			case 'B':
				if(l_stack.empty()) break;
				l_stack.pop();
				break;
			case 'P':
				l_stack.push(s.charAt(2));
				break;
			}
		}
		while(!l_stack.empty()) {
			r_stack.push(l_stack.pop());
		}
		StringBuilder sb = new StringBuilder();
		while(!r_stack.empty()) {
			sb.append(r_stack.pop());
		}
		System.out.println(sb);
		}
	
}

