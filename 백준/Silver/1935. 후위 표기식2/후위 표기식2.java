
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		double arr[] = new double[N];
		String s = br.readLine();
		for(int i=0;i<N;i++) {
			arr[i] = Double.parseDouble(br.readLine());
		}
		Stack <Double>stack = new Stack<>();
		
		double result=0;
		for(int i=0;i<s.length();i++) {
			if('A'<=s.charAt(i)&&'Z'>=s.charAt(i)) {
				stack.push(arr[s.charAt(i)-'A']);
			}
			else {
				if(!stack.isEmpty()) {
					double first = stack.pop();
					double second = stack.pop();
					switch(s.charAt(i)) {
					case '+':
						result = second+first;
						stack.push(result);
						continue;
					case '-':
						result = second-first;
						stack.push(result);
						continue;
					case '/':
						result = second/first;
						stack.push(result);
						continue;
					case '*':
						result = second*first;
						stack.push(result);
						continue;
					}
				}
				
			}
		}
		System.out.printf("%.2f",stack.pop());
	}
}

