package PrimePack;
import java.util.Scanner;

public class PrimeC {
	
public static void main(String[] args) {
	int i,n,count=0;
	System.out.print("Enter any number");
	Scanner r = new Scanner(System.in);
    n=r.nextInt();
    
    for (i=1;i<=n;i++)
    {
    	if(n%i==0)
    	{
    		count++;
    	}
    }
    
    if(count==2)
    {
    	System.out.print("Prime number");
    }
      
    else
    {
    	System.out.print("not a prime number");
    }
	}

}
