package assignment1;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 1234, reversed = 0;

	        while(num != 0) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	            num /= 10;
	        }

	        System.out.println("Reversed Number: " + reversed);

	}

}
