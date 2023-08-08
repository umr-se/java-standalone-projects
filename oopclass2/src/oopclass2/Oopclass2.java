/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopclass2;

import java.util.Scanner;

public class Oopclass2 {

      public static void main(String[] args) {

        int a;
      float b;
      String s;

      Scanner i = new Scanner(System.in);
            System.out.println("Enter a string");
      s = i.nextLine();
            System.out.println("Enter an integer");
      a = i.nextInt();
            System.out.println("Enter a float");
      b = i.nextFloat();

      System.out.println("You entered string "+s);
      System.out.println("You entered integer "+a);
      System.out.println("You entered float "+b);
 
    }

}
