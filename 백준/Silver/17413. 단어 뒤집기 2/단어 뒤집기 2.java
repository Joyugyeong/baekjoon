
import java.io.*;
import java.util.*;
public class Main {
	
	static void print(Stack stack) {
		while(!stack.empty()) {
			System.out.print(stack.peek());
			stack.pop();
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Stack st = new Stack<>();
			
			String s= br.readLine();
			boolean check = false;
			
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='<') {
					print(st);
					check =true;
					System.out.print(s.charAt(i));
				}
				else if(s.charAt(i)=='>') {
					check=false;
					System.out.print(s.charAt(i));
				}
				else if(check) {
					System.out.print(s.charAt(i));
				}
				else {
					if(s.charAt(i)==' ') {
						print(st);
						System.out.print(s.charAt(i));
					}
					else {
						st.push(s.charAt(i));
					}
				}
			}
			print(st);
		}
	
}

