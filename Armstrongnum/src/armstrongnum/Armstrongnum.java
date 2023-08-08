package armstrongnum;

import java.util.Scanner;

public class Armstrongnum {

    public static void main(String[] args) {
    int num = 153;
    int t1 = num;
    int length = 0;
    while(t1 !=0){
    t1 = t1 / 10;
    length = length + 1; 
    }
    if(t1 == 0){
        System.out.println("T1 is a Armstrong No.");
    }
    else{
        System.out.println("T1 is not Armstrong No.");
    }
      }
}
