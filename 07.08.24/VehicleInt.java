import java.util.Scanner;

class Vehicle{
	int time;
	double principal;
	double rate;
	double interest;
	double amt;
	void getdata(int time,double principal){
		this.time=time;
		this.principal=principal;
	}
	
	void cal(){
		if (this.time <=5){
			interest = (principal*15*time)/100;
			amt = principal + interest;
		}
		else if(this.time >5 && this.time <=10){
			interest = (principal*12*time)/100;
			amt = principal + interest;
		}
		else{
			interest = (principal*10*time)/100;
			amt = principal + interest;
		}
	}
	
	void display(){
		System.out.println("Amount : "+amt);
		System.out.println("Interest : "+interest);
	}
	
}

public class VehicleInt{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal : ");
		String principal = sc.nextDouble();
		System.out.println("Enter the time (year): ");
		int time = sc.nextInt();
		Vehicle veh = new Employee();
		veh.getdata(time,principal);
		veh.cal();
		veh.display();
		sc.close();
	}

}
