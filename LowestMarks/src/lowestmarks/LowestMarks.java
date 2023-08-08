package lowestmarks;

import java.util.Scanner;

public class LowestMarks {

    public static void main(String[] args) {
//        int sum=0;
        int min=0;
        int lowestMarks = 0;
        Scanner scan = new Scanner(System.in);
        int[] marks = new int[5];
        for(int i=0; i<5;i++){
        System.out.print("Enter Marks ");
        marks[i] = scan.nextInt();
//        sum = sum + marks[i];
        if(marks[i]<marks[0]){
            min = marks[i];
            lowestMarks = i;     
            }
         }
         System.out.println("");
            System.out.println("Lowest Marks are : "+min);
        }       
    }
