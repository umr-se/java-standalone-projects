package house;

class House1 {
    String name = "Super Class";
    void print(){
        System.out.println("1 : "+name);
    }
}
    class House2 extends House1 {
    String name = "Sub Class";
    void printc(){
        System.out.println("2 : "+super.name);
    }
    }
  
    class House{
    public static void main(String[] args) {
    House1 h1 = new House1();
    House2 h2 = new House2();
    h1.print();
    h2.printc();
           
    }
    
}
