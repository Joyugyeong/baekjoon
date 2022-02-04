package baekjoon2751;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(); // 붙여주는 역할
		int N = s.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<N;i++)
		{
			list.add(s.nextInt()); // 리스트에 숫자넣기 
		}
		Collections.sort(list);
		for(int value:list)
		{
			sb.append(value).append("\n");
		}
		System.out.println(sb);
	}

}
