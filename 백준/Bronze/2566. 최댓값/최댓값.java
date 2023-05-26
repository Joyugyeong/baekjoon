
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner s = new Scanner(System.in);
    	int arr[][]=new int[9][9];
    	int line[] = new int[9];
    	int max[]=new int[9];
    	for(int i=0;i<9;i++) {
    		for(int j=0;j<9;j++) {
    			arr[i][j] = s.nextInt();
    			line[j]=arr[i][j];
    		}
    		Arrays.sort(line);
    		max[i]=line[8];
    	}
    	Arrays.sort(max);
    	for(int i=0;i<9;i++) {
    		for(int j=0;j<9;j++) {
    			if(arr[i][j]==max[8]) {
    				System.out.println(max[8]);
    				System.out.print((i+1)+" ");
    				System.out.print((j+1)+" ");
    			}
    		}
    	}

    }
}