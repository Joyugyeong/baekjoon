package baekjoon7568;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int [][]arr = new int[N][2];
		for(int i=0;i<N;i++)
		{
			arr[i][0] = s.nextInt(); // 키
			arr[i][1] = s.nextInt(); // 몸무게
		}
		for(int i =0;i<N;i++)
		{
			int score =1;
			
			for(int j=0;j<N;j++)
			{
				if(i==j)
					continue;
				if(arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1])
				{
					score++;
					// 자기보다 큰 덩치가 있다면 등수는 낮아지기에 플러스
				}
			}
			System.out.print(score + " ");
		}
	}

}
