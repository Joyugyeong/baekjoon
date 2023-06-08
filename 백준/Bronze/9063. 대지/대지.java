
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int [] x = new int[N];
    	int [] y = new int[N];
    	for(int i=0;i<N;i++) {
    		x[i]= sc.nextInt();
    		y[i]= sc.nextInt();
    	}
    	Arrays.sort(x);
    	Arrays.sort(y);
    	System.out.print((x[N-1]-x[0])*(y[N-1]-y[0]));
    }
}