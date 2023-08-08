package twoconstruck;

public class TwoConstruck {
    static String name = "UMER";
    int x = 26;
    
//    static method
    static void p1(){
        System.out.println("Name : "+name);
    }

//    non static method
    public void p2(){
        System.out.println("Roll no. : "+x);
    }

    public static void main(String[] args) {
    TwoConstruck cons = new TwoConstruck();
    
//    static method don't require object
    p1();
    
//    non static method does require object
    cons.p2();
   
    }
    
}
