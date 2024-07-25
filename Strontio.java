public class Strontio {
    public static void main(String[] args) {

        int num=1386;
        int temp=num;
        int count=0;
        while(temp>0)
        {
            int rem=temp%10;
            count++;
            temp/=10;
        }
        int ar[]= new int[4];
        int sum=0;
        if(count==4)
        {
            int i=0;
            num=num*2;
            while(num>0 && i<ar.length)
            {
                int rem=num%10;
                ar[i]+=rem;
                sum=(sum*10)+rem;
                i++;
                num/=10;


            }
            System.out.println(ar[0]);
            System.out.println(ar[2]);
            System.out.println(sum);
            if(ar[0]==ar[3])
            {
                System.out.println("Strontio number ");
            }
            else
            {
                System.out.println("Not a strontio number ");
            }
        }
        else{
            System.out.println("Not a strontio number");
        }
       
        
    }
}