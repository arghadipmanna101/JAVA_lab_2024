// Write a Java Program to find Sum of n-natural numbers.
import java.util.Scanner;
class SumOfNatural
{
	public static void main(String[] args)
	{
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number :");
		int num= sc.nextInt();
		for(i=1;i<=num;i++)
			sum=sum+i;
		System.out.println("The sum = "+sum);
	}
}	
