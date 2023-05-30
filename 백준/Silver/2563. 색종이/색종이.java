

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt();
    	boolean arr [][]= new boolean[100][100];
    	int xp = 0;
    	int yp=0;
    	int area =0;
    	for(int i=0;i<n;i++) {
    		xp = s.nextInt();
    		yp = s.nextInt();
    		for(int x=xp;x<xp+10;x++) {
    			for(int y=yp;y<yp+10;y++) {
    				if(!arr[y][x]) {
    					area++;
    					arr[y][x]=true;
    				}
    			}
    		}
    	}
    	System.out.println(area);

    }
}