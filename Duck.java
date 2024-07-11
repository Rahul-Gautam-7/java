import java.util.*;
public class Duck {

    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = false;
        
        while (num>0) {
            
            int rem = num%10;
            if(rem == 0)
            {
                flag = true;
                break;
            }
            num/=10;
        }
        if(flag)
        {
            System.out.println("It is a Duck number ");
        }
        else
        {
            System.out.println("It is not a Duck number ");
        }
        
    }
    
}
