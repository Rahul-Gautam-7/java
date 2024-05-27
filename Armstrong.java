import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        int temp=num;
        int nwnum=0;

        while (temp>0) {

            int rem=temp%10;
            nwnum += (rem*rem*rem);
            temp/=10;
            
        }

        if(nwnum == num)
        {
            System.out.println("The number is armstrong number");
        }
        else
        {
            System.out.println("The number is not armstrong number ");
        }
    }
    
}
