public class Square{
    public static void main(String[] args)
    {
        int num=4;

        double sqrt=num/2;
        double t;
        
        do{
            t=sqrt;
            sqrt=(t+(num/t))/2;
        }while((t-sqrt)!=0);
        System.out.println(sqrt);

    }
}