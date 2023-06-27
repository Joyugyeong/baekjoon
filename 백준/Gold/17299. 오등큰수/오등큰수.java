
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());
        int[] count = new int[1000001];
        int[] index = new int[N];
        int[] answer = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i<N; i++) {
        	index[i] =Integer.parseInt(st.nextToken());
        	count[index[i]]++;
        }
        
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i<N; i++){

            while(!s.isEmpty() && count[index[i]] > count[index[s.peek()]]){
                answer[s.pop()] = index[i];
            }

            s.push(i);
        }

        while(!s.isEmpty())
            answer[s.pop()] = -1;

        for(int i = 0; i<N; i++)
            sb.append(answer[i]).append(" ");

        System.out.println(sb);
    }
}