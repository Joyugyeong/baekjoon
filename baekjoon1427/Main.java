package baekjoon1427;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N= s.nextInt(); //�Է¹���
		int counting [] =new int [10]; // �ڸ��� ���� 0~9
		while(N!=0)
		{
			counting[N%10]++;
			N/=10;
		}
		for(int i=9;i>=0;i--)
		{
			while(counting[i]-- >0)
			{
				System.out.print(i);
			}
		}
	}

}
