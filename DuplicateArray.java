import java.util.*;
import java.util.stream.IntStream;

public class DuplicateArray {

    public static void main(String[] args) {
        
        int ar[] = {5,4,1,2,3,44,5};
        
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j])
                {
                    System.out.println(ar[j]);
                }
            }
        }
        


    }
    
}
