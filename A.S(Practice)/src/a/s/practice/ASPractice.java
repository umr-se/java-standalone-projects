package a.s.practice;
import java.util.Scanner;
public class ASPractice {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter Size : ");
      int size = scan.nextInt();
      int[] array = new int[size];
      for(int i = 0; i<size; i++){
      System.out.print("Enter Element : ");
      array[i]=scan.nextInt();
      }
      int n,d;
      System.out.print("Enter Nth term : ");
      n = scan.nextInt();
      d = array[1] - array[0];
      if(array[3]-array[2] == array[2]-array[1] && array[1]-array[2] == array[2]-array[3] ){
          System.out.println("The Desired Output is : "+String.valueOf(array[0]+(n-1)*d));
      }
      else{
          System.out.println("This is no A.S !!");
      }
    }   
}
