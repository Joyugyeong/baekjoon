package baekjoon2839;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int five=0;
		int three=0;
		for(int i=0;i<1001;i++)
		{
			for(int j=0;j<1001;j++)
			{
				if(num==5*i+3*j)
				{
					five = i;
					three = j;
					break;
				}
			
			}
		}
		if(five!=0||three!=0)
		{System.out.print(five+three);}
		else if(five==0&&three==0)
		{{System.out.print(-1);}}
	}

}
