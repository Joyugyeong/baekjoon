package baekjoon2108;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int arr[] = new int [N];
		int count[] = new int[8001]; // �ֺ��� ���� ���� ����
		ArrayList<Integer> list = new ArrayList<Integer>();
		int num1=0; // ���
		int num2=0;	// �߰���
		int num3=0;	// �ֺ�
		int num4=0; // ����
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
			if(count[i]==max) //���� �󵵼��� ������
			{
				list.add(i-4000); // ����Ʈ�� �ֱ�
			}
		}
		if(list.size()==1) // �ֺ��� ������찡 ���� �ϳ����
		{
			num3 = list.get(0); // ù��° �ε��� ��
		}
		else // ���������
		{
			num3 = list.get(1); // �ι�°�� ������
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
