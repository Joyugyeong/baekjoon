
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		Stack <Character> stack = new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			char now = str.charAt(i);
			switch(now) {
			case '+':
			case '-':
			case '/':
			case '*':
				while(!stack.isEmpty()&&priority(stack.peek())>=priority(now)){
					sb.append(stack.pop());
				}
				stack.push(now);
				break;
			case '(':
				stack.push(now);
				break;
			case ')':
				while(!stack.isEmpty()&&stack.peek()!='(')
				{
					sb.append(stack.pop());
				}
				stack.pop();
				break;
			default :
				sb.append(now);
			}
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb);
		
	}
	public static int priority(char c) {
		if (c=='('||c==')') {
			return 0;
		} else if(c=='+'||c=='-') {
			return 1;
		} else if(c=='*'||c=='/') {
			return 2;
		}
		return -1;
	}
}

