
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		String arr[] = new String[str.length()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=str.substring(i,arr.length);
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}

