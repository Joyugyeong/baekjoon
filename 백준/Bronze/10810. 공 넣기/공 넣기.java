
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int arr[]= new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = 0;
		}
		for(int i=0;i<M;i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			for(int j=a;j<=b;j++) {
				arr[j-1]=c;
			}
		}
		for(int i=0;i<N;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
