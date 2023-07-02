
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		int arr[] = new int [26];
		for(int i=0;i<26;i++) {
			arr[i]=-1;
		}
		for(char c = 'a';c<='z';c++) {
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)==c) {
					if(arr[c-'a']==-1) arr[c-'a']=i;
				}
			}
		}
		for(int i=0;i<26;i++) {
			sb.append(arr[i]).append(' ');
		}
		System.out.print(sb);
	}
}

