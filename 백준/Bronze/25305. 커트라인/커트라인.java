import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        // 응시자 수 N
        int N = Integer.parseInt(st.nextToken());
        // 사람의 수 k
        int k = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
            list.add(Integer.parseInt(st.nextToken()));

        Collections.sort(list);

        str.append(list.get(N-k));

        System.out.print(str);
        br.close();
	}
	
}

