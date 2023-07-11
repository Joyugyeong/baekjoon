
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        
        if(N==0)
        	System.out.print(N);
        
        while(N!=0) {
        	list.add(Math.abs(N%-2));
        	N = (int)Math.ceil((double)N/-2);
        }
        
        for(int i = list.size()-1 ; i >= 0 ; i--) {
        	System.out.print(list.get(i));
        }
    }
    
}