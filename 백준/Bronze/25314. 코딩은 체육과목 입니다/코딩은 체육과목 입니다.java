import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str ="";
		int N = s.nextInt();
		for(int i=0;i<N/4;i++) {
			str += "long ";
		}
		str +="int";
		System.out.print(str);
	}

}
