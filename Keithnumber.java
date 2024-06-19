import java.util.*;

import javax.management.Query;
public class Keithnumber {

    public static void keith(int num)
    {
        Queue<Integer> q = new LinkedList<>();
        int rem,temp=num;
        while(temp>0)
        {
            rem = temp%10;
           q.add(rem);
           temp/=10;
        }
        while(num != og)
        {
           int og = q.peek();
           q.remove();
           

        }

    }


    public static void main(String[] args) {
        int num = 19;
    }
}