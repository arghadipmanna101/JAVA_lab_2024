import java.util.Scanner;

class Library{

	String name;
	int price;
	int day;
	double fine;
	void input(int price,String name,int day){
		this.price=price;
		this.name=name;
		this.day=day;
	}
	
	void cal(){
		if (this.day <=7){
			this.fine=day*0.25;
		}
		else if(this.day >= 8 && this.day <= 15){
			this.fine= day*0.40;
		}
		else if(this.day >= 16 && this.day <=30){
			this.fine= day*0.60;
		}
		else{
			this.fine= day*0.80;
		}
	}
	
	void display(){
		System.out.println("Book Name: "+name);
		System.out.println("Fine : "+fine);
	}
	
}

public class LibraryProb{
	public static void main(String[] args){
		Library lib=new Library();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the book : ");
		String name = sc.nextLine();
		System.out.println("Enter the price (int): ");
		int price = sc.nextInt();
		System.out.println("Enter the no. of day (int): ");
		int day = sc.nextInt();
		lib.input(price, name,day);
		lib.cal();
		lib.display();
		sc.close();
	}

}
