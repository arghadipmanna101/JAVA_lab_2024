//Write a Java program to calculate GCD of two integer numbers

class findGCD
{
	static int calGCD(int n,int m)
	{
		int gcd=1;
		for(int i=1;i<=n && i<=m;i++)
		{
			if(n%i==0 && m%i==0)
				gcd=i;
		}
		return gcd;
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
		int m=Integer.parseInt(args[1]);
		int gcd=calGCD(n,m);
		System.out.println("GCD = "+gcd);
	}
}
