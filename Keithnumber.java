import java.util.*;

import javax.management.Query;
public class Keithnumber {

    public static void keith(int num)
    {
       ArrayList<Integer> lst = new ArrayList<>();
        int ndigit=0,temp=num;
        while(temp>0)
        {
            lst.add(temp%10);
            temp/=10;
            ndigit++;
        }
        Collections.reverse(lst);

        int nxt =0,i=ndigit;
        while (nxt<num) 
        {
            nxt =0;
            for(int j=1;j<=ndigit;j++)
            {
                nxt+=lst.get(i-j);
                System.out.print(lst.get(i-j)+" ");
            }
            lst.add(nxt);
            i++;
        }
        if(nxt == num)
        {
            System.out.println("keith number");
        }
        else
        {
            System.out.println("not a keith number");
        }
       

    }


    public static void main(String[] args) {
        int num = 19;
        keith(num);
    }
}