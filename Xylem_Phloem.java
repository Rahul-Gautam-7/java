//The sum of extreme = mean is xylem number else phloem number
public class Xylem_Phloem {
    public static void main(String[] args) {
        int num=34326;
        int temp=num;
        int count=0;
        while(temp>0)
        {
            count++;
            temp/=10;
        }
        int ar[]= new int[count];
        int sum=0;
          int i=0;
           
            while(num>0 && i<ar.length)
            {
                int rem=num%10;
                ar[i]+=rem;
                sum=(sum*10)+rem;
                i++;
                num/=10;
            }
           
            int mean=0;
           int extreme=ar[0]+ar[ar.length-1];
           for(int j=1;j<ar.length-1;j++)
           {
                mean+=ar[j];
           }
           
           if(mean==extreme)
           {
            System.out.println("Xylem number");
           }
           else
           {
            System.out.println("Phloem number");
           }
        
       
    }
}
