import java.util.Scanner;

class Rectangle
{
	private double length;
	private double breadth;
	/*
	Rectangle()
	{
		this.length=length;
		this.breadth=breadth;
	}
	*/
	void inputData()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle :");
		length=obj.nextDouble();
		System.out.println("Enter the breadth of the rectangle :");
		breadth=obj.nextDouble();
		
	}
	
	double calculateArea(double length,double breadth)
	{
		return length*breadth;
	}
	
	double calculatePerimeter(double length,double breadth)
	{
		return 2*(length+breadth);
	}
	
	void outputData()
	{
		System.out.println("The Area of the rectangle is :"+calculateArea(length,breadth));
		System.out.println("The Perimeter of the rectangle is :"+calculatePerimeter(length,breadth));
	}
	
}
class RectangleSol
{
	public static void main(String[] args)
	{
		Rectangle rectangle=new Rectangle();
		rectangle.inputData();
		rectangle.outputData();
	}
}

