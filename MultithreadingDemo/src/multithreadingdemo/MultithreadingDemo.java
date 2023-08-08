package multithreadingdemo;
public class MultithreadingDemo extends Thread{
    public void run(){
        System.out.println("Running Thread Name : "+this.currentThread().getName());
        System.out.println("Running Thread Priority : "+this.currentThread().getPriority());
    }
    public static void main(String[] args) {
    MultithreadingDemo Obj1 = new MultithreadingDemo();
    Obj1.setName("First Thread");
    Obj1.setPriority(MIN_PRIORITY);
    
    MultithreadingDemo Obj2 = new MultithreadingDemo();
    Obj2.setName("Secod Thread");
    Obj2.setPriority(MAX_PRIORITY);
    
    MultithreadingDemo Obj3 = new MultithreadingDemo();
    Obj2.setName("Third Thread");
    Obj2.setPriority(NORM_PRIORITY);
    
    Obj1.start();
    Obj2.start();
    Obj3.start();
    }
    
}
