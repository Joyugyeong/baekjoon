
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger bin = new BigInteger(br.readLine(),8);
        System.out.print(bin.toString(2));
    }
    
}