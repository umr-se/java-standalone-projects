/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package odd.no.right.angle.triangle;

import java.util.Scanner;

public class OddNoRightAngleTriangle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row;
        System.out.print("Enter rows. : ");
        row = scan.nextInt();
    for(int i = 1; i<=row; i++){
        for(int j = 1; j<=i*2-1; j++){
            System.out.print("* ");
        }
            System.out.println("");
        }        
    }
}
