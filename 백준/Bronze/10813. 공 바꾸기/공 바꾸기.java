
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int arr[]= new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = i+1;
		}
		for(int i=0;i<M;i++) {
			int a = s.nextInt()-1;
			int b = s.nextInt()-1;
			int num=arr[a];
			arr[a] = arr[b];
			arr[b] = num;
		}
		for(int i=0;i<N;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
