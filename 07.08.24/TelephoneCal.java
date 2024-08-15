import java.util.Scanner;

class Telephone{
	int prv;
	int pre;
	int call;
	String name;
	double amount;
	double total;
	void input(int prv,int pre, String name){
		this.prv=prv;
		this.pre=pre;
		this.name=name;	
	}
	
	void cal(){
		this.call= this.pre- this.prv;
		this.amount=0;
		if (call <= 100){
			this.amount+=0;
		}
		if(call<=200){
			this.amount+=0.9*100;
		}
		if(call<=400){
			this.amount+=0.8*200;
		}
		if (call>400){
			this.amount+=0.7*(call-400);
		}
		this.total=this.amount+180;
	}
	
	void display(){
		System.out.println("Name: "+name);
		System.out.println("Calls made: "+call);
		System.out.println("Amount: "+amount);
		System.out.println("Total amount: "+total);
	}
	
}

public class TelephoneCal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		System.out.println("Enter the prv(int): ");
		int prv = sc.nextInt();
		System.out.println("Enter the pre(int): ");
		int pre = sc.nextInt();
		
		Telephone t1= new Telephone();
		t1.input(prv, pre, name);
		t1.cal();
		t1.display();
		sc.close();
	}

}
