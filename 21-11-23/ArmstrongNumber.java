public class ArmstrongNumber 
{
    public static void main(String[] args)
    {
    int m = 153, sum = 0, dig =0;
		//counting digits
		int temp2 = m, temp = m;
		while (temp2!=0){
			dig++;
			temp2 = temp2/10;
		}
		while(temp!=0){
		
			int d = temp%10;
			sum += (int)Math.pow(d,dig);
			temp = temp/10;
		}
		if (sum==m) System.out.println(m+" Is an Armstrong Number");
		else System.out.println(m+" Is Not an Armstrong Number"); 
    }
}
