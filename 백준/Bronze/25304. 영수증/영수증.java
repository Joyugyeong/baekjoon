import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int X = s.nextInt();
		int N = s.nextInt();
		int sum=0;
		for(int i=0;i<N;i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			sum += a*b;
		}
		if(X==sum) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
	}

}
