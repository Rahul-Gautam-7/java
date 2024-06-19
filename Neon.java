public class Neon {

    public static void main(String[] args) {
        int num =9;
        int square =num*num;
        int sum=0;
        while(square>0)
        {
            int rem =square%10;
            sum+=rem;
            square/=10;
            
        }
        if(sum == num)
        {
            System.out.println("Neon number");
        }
        else
        {
            System.out.println("Not a neon number");
        }
    }
    
}
