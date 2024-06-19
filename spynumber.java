public class spynumber {

    public static void main(String[] args) {
        int num=132;
        int sum =0;
        int product =1;
        while(num>0)
        {
            int rem = num%10;
            sum+=rem;
            product*=rem;
            num/=10;
        }
        if(sum == product)
        {
            System.out.println("Spy number");
        }
        else
        {
            System.out.println("Not a Spy Number");
        }
    }
    
}
