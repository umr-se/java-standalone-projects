/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pyramid;

public class Main {

  public static void main(String[] args) {
    int k = 0;
    for (int i = 1; i <= 5; i++ , k=0) {
      for (int space = 1; space <= 5 - i; space++) {
        System.out.print("  ");
      }

      while (k != 2 * i - 1) {
        System.out.print("* ");
        k++;
      }
      System.out.println();
    }
  }
}

