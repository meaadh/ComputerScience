package hassan;

import java.util.Scanner;

public class Six_homework {

	public static void main(String[] args) 
	{
		Scanner prime= new Scanner (System.in);
		System.out.println("Choose your Factorial Number");
		int p=prime.nextInt();
		int sum=1;
		for(int x=p;x>=1;x--)
		{
			sum=sum*x;
		}
		System.out.println(sum);
	}

}
