
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int arr[] = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]= i+1;
		}
		for(int i=0;i<M;i++) {
			int a=s.nextInt();
			int b=s.nextInt();
			
			ArrayList<Integer> list = new ArrayList<>();
			for(int j=a-1;j<b;j++) {
				list.add(arr[j]);
			}
			int c = 0;
			
			for(int j=b-1;j>=a-1;j--) {
				arr[j]=list.get(c);
				c++;
			}
			
		}
		for(int i=0;i<N;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
