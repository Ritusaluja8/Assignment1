package assignment1;

import java.util.Scanner;

public class Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the charecter (R/B/G/O/Y/W)");
		color=sc.next();
		switch(color)
		{
		case "R": 
            System.out.println("RED");
            break;
        case "B": 
            System.out.println("BLUE");
            break;
        case "G": 
            System.out.println("GREEN");
            break;
        case "O": 
            System.out.println("ORANGE");
            break;
        case "Y": 
            System.out.println("YELLOW");
            break;
        case "W": 
            System.out.println("WHITE");
            break;
            default:
            	System.out.println("Invalid Color");
		}
		

	}

}
