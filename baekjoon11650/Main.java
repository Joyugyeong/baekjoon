package baekjoon11650;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int arr[][] = new int [N][2];
		for(int i=0;i<N;i++)
		{
			arr[i][0] = s.nextInt();
			arr[i][1] = s.nextInt();
		}
		Arrays.sort(arr, new Comparator<int[]>() { // 인터페이스 재정의		
			@Override
			public int compare(int[] e1, int[] e2) {
				if(e1[0] == e2[0]) {		// x좌표가 같을때
					return e1[1] - e2[1];	// 첫번째 y좌표가 두번째 y좌표보다 작다면 -1리턴 -> 순서 바뀜!
				}
				else {
					return e1[0] - e2[0];	// x좌표값에 따라서 정렬 
				}
			}
		});
		for(int i=0;i<N;i++) {
			
			System.out.println(arr[i][0]+" "+arr[i][1]);
	
		}
		
	}

}
