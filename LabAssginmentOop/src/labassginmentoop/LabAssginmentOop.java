
package labassginmentoop;

import java.util.Scanner;

public class LabAssginmentOop {

    public static void main(String[] args) {
         int sum=0;
	int max=0;
	int min=0;
	int store=0;
	int lowestmarks=0;
	double average;
	String name[] = new String[5];
	int marks[] = new int[5];
	Scanner s = new Scanner(System.in);
        System.out.println("026 Muhammad Umer");
        
	for(int i=0;i<5;i++)
	{	
            System.out.print("Enter the name of the student : ");
	    name[i] = s.nextLine();
	}
	for(int i=0;i<5;i++)
	{
	    System.out.print("Enter the marks of " + " " + name[i] + " " + "Out of 100 : ");
	    marks[i]=s.nextInt();	  
	}
	System.out.println();
	
	for(int i=0;i<5;i++)
	{
	    System.out.print("Name of Student : "+ name[i] + "        "+ "Marks Obtained : "+ marks[i]);
	     sum = sum + marks[i];
	        if (marks[i] > marks[0]) {
            max = marks[i];   // new maximum
         store = i;
        }
       
            else
         if (marks[i] < marks[0]) {
            min = marks[i];   // new maximum
         lowestmarks = i;
        }
	    
	}
	System.out.println();
	
        average = sum/5;
	
        System.out.println("The average of the marks of the students is "+ " "+ average);
	System.out.println();
	System.out.println("The highest marks are "+ " " +max+ " "+ "Obtained by "+ " "+ name[store]);
	System.out.println();
	System.out.println("The lowest marks are "+ " " +min+ " "+ "Obtained by "+ " "+ name[lowestmarks]);
	System.out.println();
	  
        for(int i=0;i<5;i++)
	  {
	    System.out.println("The percentage of Student "+ " "+ name[i]+ " "+ "Marks is "+ " "+marks[i]+"%");	    
	  }	
	 }
    }
   
