import java.util.Scanner;
public class Buzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int rem ;
        
        if(num%7 == 0 || num%10 == 7)
        {
            System.out.println("It is a buzz number ");
        }
        else
        {
            System.out.println("It is not a buzz number");
        }
    }
}
