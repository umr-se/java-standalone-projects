
package araylistsort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArayListSort {

    public static void main(String[] args) {
    String temp;
    Scanner scan = new Scanner(System.in);
    ArrayList<String> name = new ArrayList<String>();
    name.add("UMER");
    name.add("ALI");
    name.add("HASAN");
    name.add("NOUMAN");
        System.out.println("BEFORE SORTING : "+name);
        Collections.sort(name);
        System.out.println("AFTER SORTING : "+name);
      }
    }
  
   
