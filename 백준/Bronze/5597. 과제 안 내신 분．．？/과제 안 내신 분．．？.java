import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int arr[] = new int[30];
		for(int i=0;i<30;i++) {
			arr[i]=1;
		}
		for(int i=0;i<28;i++) {
			int n = s.nextInt();
			arr[n-1]=0;
		}
		for(int i=0;i<30;i++) {
			if(arr[i]==1) {
				System.out.println(i+1);
			}
		}
	}

}
