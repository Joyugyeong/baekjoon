
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str="";
		while((str=br.readLine())!=null) {
			int arr[] = new int [4];
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
					arr[0]++;
				}
				else if(str.charAt(i)>='A'&&str.charAt(i)<='Z') {
					arr[1]++;
				}
				else if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
					arr[2]++;
				}
				else {
					arr[3]++;
				}
			}
			for(int i=0;i<4;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.print('\n');
		}
	}
}

