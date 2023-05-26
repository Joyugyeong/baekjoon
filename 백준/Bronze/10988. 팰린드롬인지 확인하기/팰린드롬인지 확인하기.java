
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		for(int i=0;i<str.length()/2;i++) {
			char front = str.charAt(i);
			char back = str.charAt(str.length()-1-i);
			
			if(front!=back) {
				System.out.print(0);
				return;
			}
		}
		System.out.print(1);
		
	}

}
