
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner s = new Scanner(System.in);
    	int T = s.nextInt();
    	for(int i=0;i<T;i++) {
    		int arr[] = new int[4];
    		int C = s.nextInt();
    		arr[0]=C/25;
    		arr[1]=C%25/10;
    		arr[2]=C%25%10/5;
    		arr[3]=C%25%10%5;
    		for(int j=0;j<4;j++) {
    			System.out.print(arr[j]+" ");
    		}
    		System.out.println();
    	}
    }
}