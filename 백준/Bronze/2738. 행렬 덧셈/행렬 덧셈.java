
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt();
    	int m = s.nextInt();
    	int [][]arr1= new int [n][m];
    	int [][]arr2= new int [n][m];
    	int [][]arr3= new int [n][m];
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			arr1[i][j]= s.nextInt();
    		}
    	}
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			arr2[i][j]= s.nextInt();
    		}
    	}
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			arr3[i][j]= arr1[i][j]+arr2[i][j];
    		}
    	}
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			System.out.print(arr3[i][j]+" ");
    		}
    		System.out.print("\n");
    	}
       
    }
}