import java.util.*;
public class Sunnynumber {

    public static void main(String[] args) {
        int num =8;
        int newnum =num+1;
       
       double sqareroot= Math.sqrt(newnum);

       if(sqareroot - Math.floor(sqareroot) == 0)
       {
            System.out.println("Sunny number ");
       }
       else
       {
            System.out.println("Not a sunny number");
       }
       

    }
    
}
