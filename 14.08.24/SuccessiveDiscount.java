import java.util.Scanner;
class  successiveDiscount
{
	static void Discount(int price)
	{
		System.out.println("After the single discount the price is :"+Discount(price,10));
		System.out.println("After the Successive discount the price is :"+Discount(price,10,8));	
	}
	
	static double Discount(int price,int d)
	{
		int priceAfterDis=price-price*d/100;
		return priceAfterDis;
	}
	
	static double Discount(int price,int d1,int d2)
	{
		int priceAfterDis=price-price*d1/100;
		priceAfterDis=priceAfterDis-priceAfterDis*d2/100;
		return priceAfterDis;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter the price :");
		Scanner sc=new Scanner(System.in);
		int price=sc.nextInt();
		Discount(price);
	}
}

