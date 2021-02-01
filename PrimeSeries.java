package assignment1;

import java.util.Scanner;

public class PrimeSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,i,j,flag;
		Scanner scan= new Scanner(System.in);
		System.out.println("enter number");
		int number= scan.nextInt();
		j=2;
		i=1;
		while(i<=number)
		{
			flag=1;
			for(a=2;a<=j-1;a++)
			{
				if(j%a==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			{
				System.out.println(j);
				i++;
			}
			j++;
		}

	}

}
