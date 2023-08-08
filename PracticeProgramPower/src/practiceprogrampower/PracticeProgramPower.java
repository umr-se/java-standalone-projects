/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practiceprogrampower;

import java.util.Scanner;

public class PracticeProgramPower {

    public static void main(String[] args) {
        int x,y,power=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no.: ");
        x = scan.nextInt();
        System.out.print("Enter power : ");
        y = scan.nextInt();
        for(int i=0; i<y;i++){
        power=power*x;
        }
        System.out.println(power);
    }
    
}
