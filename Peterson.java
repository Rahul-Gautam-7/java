public class Peterson {

    public static int fact(int rem)
    {
        int fact =1;
        for(int i=1;i<=rem;i++)
        {
            fact =fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int num =145;

        int temp =num;
        int rem,sum=0;

        while(temp>0)
        {
            rem=temp%10;
            sum+=fact(rem);
            temp/=10;
        }
        if(sum==num)
        {
            System.out.println("It is peterson number ");
        }
        else{
            System.out.println("Its not a peterson number");
        }
    }
    
}
