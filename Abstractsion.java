
abstract class Course{

    void display()
    {
        System.out.println("This is the course");
    }

    abstract void course();

}

class mca extends Course{
    
    void course(){
        System.out.println("list of the courses");
    }

}

class students extends Course{
    
    void course(){
    
    System.out.println("dbms,datascience ,ai,python");
    
    }
}




public class Abstractsion{

    public static void main(String[] args) {
        System.out.println("hello");

        Course c = new mca();
        c.display();
        c.course();

        students s = new students();
        s.course();
       
    }

}