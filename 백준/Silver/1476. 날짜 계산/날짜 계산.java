
import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
		int [] arr = new int [3];
		int E = 0;
		int S = 0;
		int M = 0;
		int year = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < 3 ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		while(true) {
			year++;
			E++;
			S++;
			M++;
			if(E == 16) E= 1;
			if(S == 29) S= 1;
			if(M == 20) M= 1;
			if(arr[0]==E && arr[1]==S && arr[2]==M) {
				break;
			}
		}
		System.out.print(year);
	}
	
}
//15, 28, 19