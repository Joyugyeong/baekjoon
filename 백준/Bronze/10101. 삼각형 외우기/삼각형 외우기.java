
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int A = Integer.parseInt(br.readLine());
    	int B = Integer.parseInt(br.readLine());
    	int C = Integer.parseInt(br.readLine());
    	if(A==60&&B==60&&C==60) {
    		System.out.print("Equilateral");
    	}
    	else if(A+B+C==180&&(A==B||A==C||B==C)) {
    		System.out.print("Isosceles");
    	}
    	else if(A+B+C==180) {
    		System.out.print("Scalene");
    	}
    	else {
    		System.out.print("Error");
    	}
    }
}