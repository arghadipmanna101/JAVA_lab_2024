public PrimeNum
{
	public static void main(String[] args)
	{		
		System.out.println("Number is 5");
		
		/*int fact = 1;
		for (int i = 2; i<=5; i++) fact*=i;
		
		System.out.println("Factorial of 5 is "+fact);
		*/
		//Prime number dirty approach
		int n = 5,c = 0;
		for (int i = 1; i<=(n/2); i++) {
			if (n%2==0){
				c++;
			}
			if (c>1) {
				System.out.println("Not a prime number");
				break;
			}
		}
		System.out.println(n+" Is a prime number");
	}
}
