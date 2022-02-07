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
		Arrays.sort(arr, new Comparator<int[]>() { // �������̽� ������		
			@Override
			public int compare(int[] e1, int[] e2) {
				if(e1[0] == e2[0]) {		// x��ǥ�� ������
					return e1[1] - e2[1];	// ù��° y��ǥ�� �ι�° y��ǥ���� �۴ٸ� -1���� -> ���� �ٲ�!
				}
				else {
					return e1[0] - e2[0];	// x��ǥ���� ���� ���� 
				}
			}
		});
		for(int i=0;i<N;i++) {
			
			System.out.println(arr[i][0]+" "+arr[i][1]);
	
		}
		
	}

}
