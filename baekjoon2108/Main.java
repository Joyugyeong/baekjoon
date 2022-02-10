package baekjoon2108;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int arr[] = new int [N];
		int count[] = new int[8001]; // 최빈값을 위한 수의 범위
		ArrayList<Integer> list = new ArrayList<Integer>();
		int num1=0; // 평균
		int num2=0;	// 중간값
		int num3=0;	// 최빈값
		int num4=0; // 범위
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=s.nextInt();
			count[arr[i]+4000]++;
		}
		int max=0;
		for(int i=0;i<8001;i++)
		{
			if(count[i]>=max)
			{
				max = count[i];
			}
		}
		for(int i=0;i<8001;i++)
		{
			if(count[i]==max) //제일 빈도수가 높은값
			{
				list.add(i-4000); // 리스트에 넣기
			}
		}
		if(list.size()==1) // 최빈값이 같은경우가 없이 하나라면
		{
			num3 = list.get(0); // 첫번째 인덱스 값
		}
		else // 여러개라면
		{
			num3 = list.get(1); // 두번째로 많은값
		}
		Arrays.sort(arr);
		for(int i=0; i<arr.length;i++)
		{
			num1+=arr[i];
		}
		num2 = arr[N/2];
		num4 = arr[N-1]-arr[0];
		System.out.println(Math.round((double)num1/N));
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	}

}
