public class Technumber {

    static int countDigits(int n)
    {
        int count =0;
        while(n>0)
        {
            n/=10;
            count++;
        }
        return count;
    }

    public static boolean technum(int n)
    {
        int count = countDigits(n);
        if(count %2 != 0)
        {
            return false;
        }
        int half = count/2;
        int p1 = n/(int)Math.pow(10, half);
        int p2 = n%(int)Math.pow(10, half);
        int sum =p1+p2;
        if((sum*sum)==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
     public static void main(String[] args) {
        int num = 2024;
        System.out.println(technum(num));

       
        
        
     }
}