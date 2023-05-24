import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		long sum = 0;
		for(int i=0;i<3;i++) {
			sum += s.nextLong();
		}
		System.out.print(sum);
	}

}
