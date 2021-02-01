package assignment1;

import java.util.Scanner;

public class CubicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int number= sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			t=i*i*i;
			System.out.println(t);
		}


	}

}
