package araypractice;
import java.util.Scanner;
import java.util.*;

public class ArayPractice {
    private static int i;

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Student Range : ");
        int size = scan.nextInt();
        int [] rollNo = new int[size];                        
        double [] gpa = new double[size];
        int [] marks = new int[size];
        System.out.println(" ");
        for(int i=0;i<size; i++){
        System.out.print("Enter the Roll Number : ");
        rollNo[i]= scan.nextInt();
        }
        System.out.println("");
        for(int i=0;i<size; i++){
        System.out.print("Enter GPA : ");
        gpa[i] = scan.nextDouble();
        }
        System.out.println("");
        for(int i=0;i<size; i++){
        System.out.print("Enter Marks : ");
        marks[i]= scan.nextInt();
        }
        int highestMarks = 0;
        for(int i=0; i<size; i++){ 
        if(marks[i]>marks[0]){
        highestMarks = marks[i];
        }
        }
        System.out.println("");        
        for(int i=0; i<size; i++){
        System.out.println("Roll No."+rollNo[i]+" have gpa "+gpa[i]+" and Marks are : "+marks[i]);
        }
        System.out.println("\nHighest Marks are : "+highestMarks);
    }
}