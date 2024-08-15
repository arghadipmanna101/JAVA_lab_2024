//Write a Java program to display prime numbers within a given range.

class PrimeNum
{
	static int isPrime(int n)
	{
		int p=1;
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
				p++;
		}
		return p;
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
		int p=isPrime(n);
		if(p==2)
			System.out.println(n+" is a Prime number.");
		else
			System.out.println(n+" is not a Prime number.");
	}
}
