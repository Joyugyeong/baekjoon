
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int arr[] = new int [6];
		int arr2[] = new int [6];
		for(int i=0;i<6;i++) {
			arr[i] = s.nextInt();
		}
		arr2[0]=1-arr[0];
		arr2[1]=1-arr[1];
		arr2[2]=2-arr[2];
		arr2[3]=2-arr[3];
		arr2[4]=2-arr[4];
		arr2[5]=8-arr[5];
		for(int i=0;i<6;i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
