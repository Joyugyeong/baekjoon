
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str[] = br.readLine().split(" ");
		String first = str[0]+str[1];
		String second = str[2]+str[3];
		
		System.out.print(Long.parseLong(first)+Long.parseLong(second));
	}
}

