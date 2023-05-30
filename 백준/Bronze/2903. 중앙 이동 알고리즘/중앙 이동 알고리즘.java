

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt();
    	int w=3;
    	int arr[] =new int [16];
    	for(int i=1;i<arr.length;i++) {
    		arr[i]=w*w;
    		w=w+(w-1);
    	}
    	System.out.print(arr[n]);

    }
}