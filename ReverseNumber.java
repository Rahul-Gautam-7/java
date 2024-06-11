public class ReverseNumber {

    public static void main(String[] args) {
        
        int num = 123;
        int temp =num;
        int rem;
        int reverse =0;
        while(temp>0)
        {
            rem =temp%10;
            reverse =(reverse*10)+rem;
            temp/=10;
        }
        System.out.println("The original number is : "+num);
        System.out.println("The reverse number is : "+reverse);
    }
    
}
