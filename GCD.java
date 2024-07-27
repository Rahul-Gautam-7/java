//Finding GCD using Euclid's algorithm
public class GCD {

    public static void main(String[] args) {
        
        int num=24;
        int num1=36;

        if(num>num1)
        {
            int rem=num1;
            while(num%num1!=0)
            {
                rem=num%num1;
                num=num1;
                num1=rem;

            }
            System.out.println(rem);
        }
        else if(num1>num)
        {
            int rem=num;
            while(num1%num!=0)
            {
                rem=num1%num;
                num1=num;
                num=rem;

            }
            System.out.println(rem);
        }
    }
    
}
