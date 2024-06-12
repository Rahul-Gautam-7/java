public class Automorphic {

    public static boolean Auto(int num)
    {
        int square = num *num;
        
       
        
        while (num>0) {

            if(num%10 !=square%10)
            {
                return false;
               
            }
            
            num/=10;
            square/=10;
            
        }
        return true;

    }
    
    public static void main(String[] args) {

        int num =76;
        System.out.println(Auto(num)?"automorphic":"not automorphic");
        

    
    }
    
}
