package assignment1;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
        Scanner SC=new Scanner(System.in);
         
        System.out.print("Enter a monthly number (1 to 12): ");
        month=SC.nextInt();
         
        if(month<1 || month>12){
            System.out.println("Invalid Month.");
            System.exit(0);
        }
         
        //print weekday name according to give value
        switch(month){
              case 1: 
                  System.out.println("JANUARY");
                  break;
              case 2: 
                  System.out.println("FEBRUARY");
                  break;
              case 3: 
                  System.out.println("MARCH");
                  break;
              case 4: 
                  System.out.println("APRIL");
                  break;
              case 5: 
                  System.out.println("MAY");
                  break;
              case 6: 
                  System.out.println("JUNE");
                  break;
              case 7: 
                  System.out.println("JULY");
                  break;  
              case 8: 
                  System.out.println("AUGUST");
                  break;
              case 9: 
                  System.out.println("SEPTEMBER");
                  break;
              case 10: 
                  System.out.println("OCTOBER");
                  break;
              case 11: 
                  System.out.println("NOVEMBER");
                  break;
              case 12: 
                  System.out.println("DECEMBER");
                  break;
              default:
                  System.out.println("Invalid");
                  break;                  
        }
	}
}