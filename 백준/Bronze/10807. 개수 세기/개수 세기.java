import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int count=0;
		int arr[]= new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = s.nextInt();
		}
		int V = s.nextInt();
		for(int i=0;i<N;i++) {
			if(arr[i]==V) {
				count++;
			}
		}
		System.out.print(count);
	}

}
