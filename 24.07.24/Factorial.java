class Factorial
{
	static int calFactorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}
	
	static int isValid(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)<'0' || str.charAt(i)>'9')
				return 0;
		}
		return 1;
	}
	
	public static void main(String[] args)
	{
		if(isValid(args[0])==0)
		{
			System.out.println("Error...");
			System.exit(1);
		}
		int n=Integer.parseInt(args[0]);
		int f=calFactorial(n);
		System.out.println("Factorial of "+n+" is :"+f);
	}
}
