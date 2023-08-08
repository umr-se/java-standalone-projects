/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ooplab;

/**
 *
 * @author umers
 */
public class OOPlab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i = 4;
       int j = 5;
        System.out.println("Hello"+i);
        System.out.println(i+j);
        String s1 = new String("pakistan");
        String s2 = "pakistan";
        if(s1==s2){
            System.out.println("Comparing using == operator");
           }
        if(s1.equals(s2)){
            System.out.println("comparing using string method");
           }    
        }
    }
