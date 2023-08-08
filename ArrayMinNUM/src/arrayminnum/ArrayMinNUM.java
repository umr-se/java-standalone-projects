package arrayminnum;

import java.util.Scanner;

public class ArrayMinNUM {
    
    static int value;
    static int num[];
 
//    static int smallestNum(int arr[]){   Method 2
//    int smallestNum = num[0];
//    for(int i=0; i<value; i++){
//    if(num[i]<smallestNum){
//    smallestNum=num[i];
//     }
    
    static int smallestNum(int arr[]){
    int smallestNum = 0;
    for(int i=0; i<value; i++){
    if(num[i]<num[0]){
    smallestNum=num[i];
     }
   }
    return smallestNum;
 }
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Range : ");
    value = scan.nextInt();
    num = new int[value];
//    if user doesn't know the overall length then we use .length instead of value
    for(int i=0; i<value; i++){
        System.out.print("Enter Number : "); 
        num[i] = scan.nextInt();
    }
        System.out.println("Smallest value : "+smallestNum(num));
  
    }
}
