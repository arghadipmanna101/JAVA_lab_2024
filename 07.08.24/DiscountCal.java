import java.util.Scanner;

class Discount{
	int cost;
	String name;
	double amt;
	double dc;
	void input(int cost,String name){
		this.cost=cost;
		this.name=name;
	}
	
	void cal(){
		if (this.cost <=5000){
			this.dc=0;
			this.amt=cost;
		}
		else if(this.cost > 5000 && this.cost <= 10000){
			this.dc= 0.1*cost;
			this.amt= this.cost-this.dc;
		}
		else if(this.cost > 10000 && this.cost <=15000){
			this.dc= 0.15*cost;
			this.amt= this.cost-this.dc;
		}
		else{
			this.dc= 0.2*cost;
			this.amt= this.cost-this.dc;
		}
	}
	
	void display(){
		System.out.println("Name of the customer: "+name);
		System.out.println("Cost: "+cost);
		System.out.println("Discount: "+dc);
		System.out.println("Amount: "+amt);
	}
	
}

public class DiscountCal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		System.out.println("Enter the Cost of item(int): ");
		int cost = sc.nextInt();
		Discount d1 = new Discount();
		d1.input(cost, name);
		d1.cal();
		d1.display();
		sc.close();
	}

}
