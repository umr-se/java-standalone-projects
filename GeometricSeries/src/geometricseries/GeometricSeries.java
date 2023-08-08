/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geometricseries;

import java.util.Scanner;

public class GeometricSeries {
    
    public static int power(int c, int b){
        int power = 1;
        for(int i=0; i<b; i++){
        power = power * c;
        }
        return power;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = scan.nextInt();
        int [] array = new int[size];
        for(int i=0; i<array.length; i++){
        System.out.print("Enter No. : ");
        array[i]=scan.nextInt();
        }
        System.out.print("Enter nth term/power. : ");
//        int c = scan.nextInt();
        int v=  scan.nextInt();
        int r = array[1]/array[0];
        if( r  == array[2]/array[1] && array[2]/array[1] == array[3]/array[2] ){
            System.out.println(array[0]*power(r,v-1));
        }
        else{
            System.out.println("Wrong Series !!");
        }
    }
}

