package baekjoon3053;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		double U =0;
		double T =0;
		U = (double)3.14159265358979 * (num * num);
		T = (double)2 * (num * num);
		String result1 = String.format("%.6f", U);
		String result2 = String.format("%.6f", T);
		System.out.println(result1);
		System.out.println(result2);
	}

}
