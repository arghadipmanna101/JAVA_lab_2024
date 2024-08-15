public class Palindrome {
    public static void main(String[] args) 
    {
        int m = 313;
        int rev = 0;
        int temp = m;
        while (temp!=0){
            rev  = 10*rev+ (temp%10);
            temp /= 10;
        }
        
        if (rev==m) System.out.println(m+" Is a Palindrome Number");
        else System.out.println(m+" Is Not a Palindrome Number");
        
    }
}
