public class REverseInteger {

    public static void main(String[] args) {
        
        int num=-123;
        StringBuilder str = new StringBuilder();
        str.append(num);
        str.reverse();
     
        String str2 ="";

       for(int i=0;i<str.length()-1;i++)
       {
            str2 = str2 + str.charAt(i);
       }
       Integer.parseInt(str2);
       System.out.println(str2);
      
    }
    
}
