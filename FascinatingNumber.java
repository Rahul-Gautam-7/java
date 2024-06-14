public class FascinatingNumber {

    public static void main(String[] args) {

        int num =219;
        int num1 = num*2;
        int num2 = num*3;
        boolean flag = true;
        String str =Integer.toString(num);
        String str1 =Integer.toString(num1);
        String str2 = Integer.toString(num2);
        
        String concate = str+str1+str2;
        System.out.println(concate);

       
        for(char ch='1';ch<='9';ch++)
        {
            int count =0;
            for(int i=0;i<concate.length();i++)
            {
                //string character extraction
                char st = concate.charAt(i);
                if(ch==st)
                {
                    count++;
                }

            }
            if(count != 1)
            {
                flag =false;
                break;

            }

        }
        if(flag)
        {
            System.out.println("Fascinating number");
        }
        else
        {
            System.out.println("Not Fascinating number");
        }

       
        
    }

   
}