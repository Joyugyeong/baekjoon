package baekjoon2751;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(); // �ٿ��ִ� ����
		int N = s.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<N;i++)
		{
			list.add(s.nextInt()); // ����Ʈ�� ���ڳֱ� 
		}
		Collections.sort(list);
		for(int value:list)
		{
			sb.append(value).append("\n");
		}
		System.out.println(sb);
	}

}
