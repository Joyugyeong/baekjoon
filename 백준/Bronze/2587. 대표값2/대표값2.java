
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr [] = new int [5];
		int a=0,b=0;
		for(int i=0;i<5;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			a+=arr[i];
		}
		Arrays.sort(arr);
		b = arr[2];
		a= a/5;
		System.out.println(a);
		System.out.println(b);
		
		
	}
	
}



