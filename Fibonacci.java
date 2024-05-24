//fibonacci series 0,1,1,2,3,5,8...
import java.util.Scanner;
class Fibonacci{
    
    public static void main(String[] args) {
     
        int num1=0;
        int num2=1;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        

        
        int nxt=num1+num2;

        System.out.print(num1+" "+num2);

        for(int i=0;i<num-2;i++)
        {
           
           System.out.print(" "+nxt);
           num1=num2;
           num2=nxt;
           nxt=num1+num2;

        }
    }
}