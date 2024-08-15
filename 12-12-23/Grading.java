//Write a Java Program MAKAUT University grading system (using switch-case).
import java.util.Scanner;
class Grading
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks : ");
		int num=sc.nextInt();
		if(num>=1 && num<=100)
		{
			switch(num/10)
			{
				case 10:
				case 9:
					System.out.println("Your grad is : O");
					break;
				case 8:
					System.out.println("Your grad is : E");
					break;
				case 7:
					System.out.println("Your grad is : A");
					break;
				case 6:
					System.out.println("Your grad is : B");
					break;
				case 5:
					System.out.println("Your grad is : C");
					break;
				default:
					System.out.println("Your grad is :D");
			}
		}
		else
			System.out.println("Bohot Harami hooo....");
	}	
}		
