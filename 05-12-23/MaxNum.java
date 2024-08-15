// Write a Java Program to find the maximum among three numbers...
public class MaxNum
{
	public static void main(String[] args)
	{
		int num1=72,num2=56,num3=29;
		int max=num1;
		max=max>num2? max:num2;
		max=max>num3? max:num3;
		
		System.out.println("The max of those 3 number is ="+max);
	}
}
