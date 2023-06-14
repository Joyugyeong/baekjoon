
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String [] str = new String[N];
		String [] arr = new String[2];
		for(int i=0;i<N;i++) {
			str[i]=br.readLine();
		}
		Stack <Integer> st = new Stack<>();
		for(int i=0;i<N;i++) {
			if(str[i].contains("push")) {
				arr=str[i].split(" ");
				st.push(Integer.parseInt(arr[1]));
			}
			else if(str[i].equals("pop")) {
				if(st.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(st.pop());
					
				}
			}
			else if(str[i].equals("top")) {
				if(st.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(st.peek());
				}
			}
			else if(str[i].equals("size")) {
				System.out.println(st.size());
			}
			else if(str[i].equals("empty")) {
				if(st.isEmpty()) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
			}
		}
		
		
//		StringBuilder sb = new StringBuilder();
//		
//		
//		System.out.print(sb);
		}
	
}

