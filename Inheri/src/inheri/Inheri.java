
package inheri;

    class Inh1{
    String name = "n1";  
    public void print(){
        System.out.println("Parent Class");
}
}

    class Inh2 extends Inh1{
    String name1 = "n2";
    
    public void print1(){
        System.out.println("Child Class");
    }
    }

public class Inheri{

    public static void main(String[] args) {
        
    Inh1 obj = new Inh1();
    Inh2 obj1 = new Inh2();
    
    obj.print();
    obj1.print1();
    
         
    }
    }
