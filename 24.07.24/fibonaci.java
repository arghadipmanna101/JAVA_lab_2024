//Write a Java program to display n Fibonacci terms.

class fibonaci
{
	static void calFibonaci(int n)
	{
		int a=0,b=1,c;
		System.out.print(a+"\t");
		System.out.print(a+"\t");
		for(int i=2;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+"\t");
		}
		System.out.println( );
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
		calFibonaci(n);
		
	}
}
