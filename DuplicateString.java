public class DuplicateString {

    public static void main(String[] args) {
        
        String str ="hello this is string ";
        char ch[] = str.toCharArray();
        System.out.println("duplicate values are");
       
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(ch[i] == ch[j])
                {
                    System.out.println(ch[j]);
                    
                    break;
                }
            }
        }
       
    }
    
}
