public class Emirp {
    
    public static void main(String[] args) {
        
        int num =13,rev=0;
        boolean flag=true;
        boolean revflag=true;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                flag = false;
            }

        }

        if(flag == true)
        {
            while(num>0)
            {
                int rem = num%10;
                rev = (rev*10)+rem;
                num/=10;
            }
            for(int i=2;i<num;i++)
             {
                 if(rev%i==0)
                 {
                    revflag = false;
                }

             }
             if(revflag == true)
             {
                System.out.println("Emirp Number");
             }
             else
             {
                System.out.println("Not Emirp Number");
             }
        }
        else
        {
            System.out.println("Not Emirp Number");
        }

    }
}
