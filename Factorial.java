import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int fact=1;
        int temp=num;

        while(temp>0)
        {
            fact =fact*temp;
            temp--;
        }

        System.out.println("The factorial of "+num+ " is "+fact);
    }
    
}
