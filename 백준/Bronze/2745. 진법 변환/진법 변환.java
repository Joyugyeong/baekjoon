

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner sc= new Scanner(System.in);
    	String s = sc.next();
    	int n = sc.nextInt();
    	int tmp=1;
    	int ans=0;
    	for(int i=s.length()-1;i>=0;i--) {
    		char c = s.charAt(i);
    		
    		if('A'<=c&&c<='Z') {
    			ans += (c-'A'+10)*tmp;
    		}else {
    			ans += (c-'0')*tmp;
    		}
    		tmp*=n;
    	}
    	
    	System.out.println(ans);
    }
}