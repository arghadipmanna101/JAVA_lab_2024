//Write a Java Program to swap two numbers using bitwise operator.
public class Swap
{
	public static void main(String[] args)
	{
		int a=6;
		int b=8;

		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a="+a+"	b="+b);
	}
}