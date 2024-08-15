//Write a Java Program to check Leap Year...
public class LeapYear
{
	public static void main(String[] args)
	{
		int year=2004;
		System.out.println("The given year is "+year);
		if((year%400==0)||((year%4==0)&&(year%100!=0)))
			System.out.println("The year is a leap Year.");
		else
			System.out.println("The year is not a leap Year.");
	}
}

			
