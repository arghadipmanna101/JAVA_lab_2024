import java.util.*; //This package is need to call "Scanner" class. This line is used to import the required things from the package java.lang.
public class Input 
{
    public static void main (String[] args){ //main() is main method

		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int m1 = sc.nextInt();
		System.out.println(m1+" Is given by user");	
	}
}
