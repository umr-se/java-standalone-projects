/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arithmatic.series;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author umers
 */
public class ArithmaticSeries {
    
    public static void main(String[] args) { 
    String s= "Your desired Series is:";
    Scanner scan = new Scanner(System.in);
    int a,a1,a2,a3,n,d;
    System.out.println("Enter no. = ");
    a = scan.nextInt();
    a1 = scan.nextInt();
    a2 = scan.nextInt();
    a3 = scan.nextInt();
    System.out.println("Enter nth value = ");
    n = scan.nextInt();
    d = a1-a;
    if(d==a2-a1&&a2-a1==a3-a2){
    
      System.out.println(s + " "+String.valueOf(a+(n-1)*d));
    }
    else{
        System.out.println("Not Arithmatic Series");
    }
  }   
}
