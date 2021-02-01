package assignment1;

public class PrimeBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,n=0,i=11,j=1;  
		while(n<21)  
		{  
		j=1;  
		count=0;  
		while(j<=i)  
		{  
		if(i%j==0)  
		count++;  
		j++;   
		}  
		if(count==2)  
		{  
		System.out.printf("%d ",i);  
		n++;  
		}  
		i++;  
		}  
	    
	}

}
