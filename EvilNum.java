import java.util.*;
public class EvilNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        //int to binary & stored in string
        String num1 = Integer.toBinaryString(num);
        //string to int
        int finalnum = Integer.parseInt(num1);
        System.out.println(finalnum);
        int count = 0;
        
        while (finalnum>0) {

            int rem = finalnum%10;
            if(rem == 1)
            {
                count++;
            }
            finalnum/=10;
            
        }
        if(count%2 == 0)
        {
            System.out.println("It is a evil number ");
        }
        else
        {
            System.out.println("It is not a evil number");
        }
        
    }
}
