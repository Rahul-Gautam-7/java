import java.util.Scanner;
public class Prime {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        boolean value=false;
        
        for (int i=2;i<num-1;i++)
        {
            if(num%i==0)
             {
                value=false;
            }
            else
            {
                value=true;
            }
        }
       
        
            
        

        if (value== true){
            System.out.println("Prime number");
        }
        else{
            System.out.println("not prime number");
        }
        
    }
    
}
