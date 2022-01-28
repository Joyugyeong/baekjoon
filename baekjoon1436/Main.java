package baekjoon1436;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int count =1;
		int num = 666;
		while (count!=N) {
			num++;
			if(String.valueOf(num).contains("666"))
			{
				count++;
			}
			
		}
		System.out.print(num);
	}

}
