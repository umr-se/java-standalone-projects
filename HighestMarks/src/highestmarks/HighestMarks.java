
package highestmarks;

import java.util.Scanner;

public class HighestMarks {

    public static void main(String[] args) {
//        int sum=0;
        int max=0;
        int highestMarks = 0;
        Scanner scan = new Scanner(System.in);
        int[] marks = new int[5];
        for(int i=0; i<5;i++){
        System.out.print("Enter Marks ");
        marks[i] = scan.nextInt();
//        sum = sum + marks[i];
        if(marks[i]>marks[0]){
            max = marks[i];
            highestMarks = i;     
            }
         }
         System.out.println("");
            System.out.println("Higest Marks are : "+max);
        }      
    }
    
