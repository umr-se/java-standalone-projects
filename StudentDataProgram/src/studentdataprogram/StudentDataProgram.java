package studentdataprogram;

import java.util.Scanner;

public class StudentDataProgram {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String[] name = new String[5];
        int[] marks = new int[5];
        for(int i = 0; i<5; i++){
        System.out.print("Enter Name : ");
        name[i]=scan.nextLine();
        }
        System.out.println("");
        for(int i = 0; i<5; i++){
        System.out.print("Enter Marks : ");
        marks[i]=scan.nextInt();
        }
        System.out.println("");
        for(int i = 0; i<5; i++){
        System.out.println("Names are : " +name[i]+ "\t" + "\t" + "Marks are : " +marks[i]);
        }
    }    
}
