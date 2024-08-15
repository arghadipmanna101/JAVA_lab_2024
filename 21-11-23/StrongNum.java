public class StrongNum 
{
    public static void main (String[] args)
    {
        int m = 10;
        int temp = m;
        int sum = 0;
        while(temp!=0){
            int d1 = temp%10;
            int fact = 1;
            for (int i = 2; i<=d1; i++){
                fact*=i;
            }
            sum+= fact;
            temp /=10;
        }
        if(sum == temp)
            System.out.println(m+" is a strong number");
        else
            System.out.println(m+" is not a strong number");
    }
    
}
