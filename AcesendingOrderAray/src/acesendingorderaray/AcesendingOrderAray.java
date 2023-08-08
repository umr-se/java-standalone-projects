
package acesendingorderaray;

import java.util.Scanner;

public class AcesendingOrderAray {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
        System.out.print("Enter Range : ");
        int range = input.nextInt();
//      num for implementing logic
        int[] num = new int[range];
//      num2 array for printing purpose 
        int[] num2 = new int[range]; 
        int temp;
        System.out.println("");
        for(int i=0;i<range; i++){
        System.out.print("Enter No. : ");
        num[i] = input.nextInt();
        num2[i] = num[i];
        } 
        System.out.println("");
        for(int i=0; i<range; i++){
        for(int j = i+1; j<range; j++){
        if(num[i]>num[j]){
        temp = num[i];
        num[i] = num[j];
        num[j] = temp;
          }
         }
        }
        System.out.println(" BEFORE ");
         for(int i=0; i<range; i++){
            System.out.println(" Value : "+num2[i]);
        }
        System.out.println("");
         System.out.println(" AFTER ");
         for(int i=0; i<range; i++){
            System.out.println(" Value : "+num[i]);
        }
    }   
}
