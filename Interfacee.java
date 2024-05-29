interface interface1{
    void disp();
}

interface interface2{
    void rec();
}



public class Interfacee implements interface1, interface2{

    public void disp(){
        System.out.println("This is first interface");
    }
    public void rec(){
        System.out.println("This is second interface");
    }

    public static void main(String[] args) {
        
        Interfacee a = new Interfacee();
        a.disp();
        a.rec();
    }
    
}
