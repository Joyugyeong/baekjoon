
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner sc= new Scanner(System.in);
    	while(true) {
    		int N = sc.nextInt();
    		int sum=0;
    		if(N==-1) {break;}
        	ArrayList <Integer>list = new ArrayList<>();
        	for(int i=1;i<N;i++) {
        		if(N%i==0) list.add(i);
        	}
        	for(int i=0;i<list.size();i++) {
        		sum+=list.get(i);
        	}
        	if(N==sum) {
        		System.out.print(N+" = ");
        		for(int i=0;i<list.size();i++) {
            		System.out.print(list.get(i));
            		if(i==list.size()-1) break;
            		System.out.print(" + ");
            	}
        	}
        	else {
        		System.out.print(N+" is NOT perfect.");
        	}
        	System.out.println();
        	
    	}
    	
 
    	
    	
    }
}