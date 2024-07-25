import java.util.*;
public class nthPrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number position of prime number : ");
        int num=sc.nextInt();
        int count=0,i;
        int n=1;
        while(count<num)
        {
            n=n+1;
            for(i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    break;
                }
            }
                if(i==n)
                {
                    count++;
                }
            

        }
        System.out.println("The "+num+"th prime number is : "+n);
    }
    
}
