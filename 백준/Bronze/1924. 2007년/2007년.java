import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int arr[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());
		int sum = 0;
		
		for(int i =0; i < month-1; i++) {
			sum += arr[i];
		}
		sum += day;
		
		System.out.println(str[sum%7]);
	}
	
}
