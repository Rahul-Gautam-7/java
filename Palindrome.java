import java.util.Scanner;


public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        //take the number in the temporary variable

        int temp = num;
        int sum=0;

        //reverse the number

        while(temp > 0)
        {
           int  rem=temp%10;
            sum = (sum*10)+rem;  //important step
            temp/=10;
        }

        //check the number with condition

        if (sum == num)
        {
            System.out.println("palindrome number");
        }
        else{
            System.out.println("not palindrome number");
        }
        
    }
    
}
