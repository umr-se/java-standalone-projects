package simpleconstruck;

public class SimpleConstruck {
    int x;
    
    public  SimpleConstruck(){
    x=5;
    x++;
    }

    public static void main(String[] args) {
     SimpleConstruck sc = new  SimpleConstruck();
            System.out.println(sc.x);
    }    
}
