package threadop;
public class ThreadOp extends Thread {
    public static void main(String[] args) {
    ThreadOp obj = new ThreadOp();
    obj.start();
        System.out.println("Running Outside");
    } 
    public void run(){
        System.out.println("Running inside");
    }
}
