import java.util.Scanner;
class  Laptop
{
	String name;
	int price;
	double dis;
	double amt;
	double Dic;
	
	/*
	Laptop(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
	*/
	 
	void Input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the customer :");
		String name=sc.nextLine();
		System.out.println("Enter the price of the laptop :");	
		double price=sc.nextDouble();
	}
	
	double Discount(int price)
	{
		
		if(price<=25000)
			Dic=price-price*5/100;
			
		else if(price>=25001 && price<=50000)
			Dic=price-price*7.5/100;
			
		else if(price>=50001 && price<=100000)
			Dic=price-price*10/100;
			
		else
			Dic=price-price*15/100;
		
		return Dic;
	}
	
	void Display(double Dic)
	{
		double Total=0;
		System.out.println("The name of the Customer is :"+name);
		System.out.println("The Discount Amount is :"+Dic);
		Total=price-Dic;
		System.out.println("The Customer have to pay :"+Total);
	}
}

class discount
{
	public static void main(String[] args)
	{
		Laptop laptop=new Laptop();
		laptop.Input();
		laptop.Discount(price);
		laptop.Display(Dic);
	}
}

