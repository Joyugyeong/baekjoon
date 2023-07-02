
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		for(int i=0;i<str.length();i++) {
			char c =str.charAt(i);
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z') {
				c = (char) ((int)str.charAt(i)+13);
				if(c>'Z') {
					c = (char)((int)c-26);
				}
				else if(c<'A') {
					c = (char)((int)c+26);
				}
				sb.append(c);
				
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				c = (char) ((int)str.charAt(i)+13);
				if(c>'z') {
					c = (char)((int)c-26);
				}
				else if(c<'a') {
					c = (char)((int)c+26);
				}
				sb.append(c);
				
			}
			else{sb.append(c);}
		}
		System.out.print(sb);
	}
}

