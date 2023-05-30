

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner sc= new Scanner(System.in);
    	int N = sc.nextInt();
    	int K = sc.nextInt();
    	ArrayList <Integer>list = new ArrayList<>();
    	for(int i=1;i<=N;i++) {
    		if(N%i==0) list.add(i);
    	}
 
    	if(list.size()<K) System.out.print(0);
    	else {
    		System.out.print(list.get(K-1));
    	}
    }
}