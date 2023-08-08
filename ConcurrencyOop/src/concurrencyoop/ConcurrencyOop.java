package concurrencyoop;
public class ConcurrencyOop extends Thread {
    public static int amount = 0;
    public static void main(String[] args) {
    ConcurrencyOop obj = new  ConcurrencyOop();
    obj.start();
        System.out.println(amount);
    amount++;
        System.out.println(amount);
    }
    public void run(){
        amount++;
    }
}
