public class reverseStringIteration {

    public static void main(String[] args) {
        
        String str ="This is a reverse string example";
        char ch[] = str.toCharArray();
        for (int i=ch.length-1;i>=0;i--)
        {
            System.out.print(ch[i]);
        }
    }
    
}
