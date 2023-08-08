package ooptheory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.UnknownHostException;
import java.util.Scanner;

public class Ooptheory {
    
    public static void main(String[] args) {
//        FA20-BSE-026
//        Muhammad Umer Saleem
        int x;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        if (x < 5) {
            try {
                throw new Exception("Exception");
            } catch (Exception q) {
                q.printStackTrace();
            }
                try {
                    throw new ClassNotFoundException("ClassNotFoundException Occured");
                } catch (Exception c) {
                    c.printStackTrace();
                }
                try {
                    throw new CloneNotSupportedException("CloneNotSupportedException Occured");
                } catch (Exception f) {
                    f.printStackTrace();
                }
            int y;
            Scanner input2 = new Scanner(System.in);
            y = input2.nextInt();
            if (y < 5) {
                try {
                    throw new IOException("IoException Occured");

                } catch (IOException e) {
                    e.printStackTrace();
                    try {
                        throw new FileNotFoundException("FileNotFoundException");
                    } catch (FileNotFoundException m) {
                        m.printStackTrace();
                    }
                    try{
                        throw new MalformedURLException("MailformedURLException");
                    }catch(MalformedURLException w){
                        w.printStackTrace();
                    }
                    try{
                        throw new UnknownHostException("UnknwonHostException");
                    }catch(UnknownHostException t){
                        t.printStackTrace();
                    }
                }
            }
        }
    }
}
