package com.j4ware.languagefeaturesjava7;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Java7AutomaticResourceManagement {
    
    public static void main(String... args) {
        beforeJava7();
        fromJava7();
    }
    
    private static void beforeJava7() {
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream("movies.txt"));
            dos.writeUTF("Java 7 Block Buster");
        } catch(IOException e) {
            System.out.println("Unable to write");
            e.printStackTrace();
        } finally{
            try {
                if (dos != null) {
                    dos.close();
                }
            } catch(IOException e) {
                System.out.println("Unable to close");
                e.printStackTrace();
            }
        }
    }

    private static void fromJava7() {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("movies.txt"))) {
            dos.writeUTF("Java 7 Block Buster");
        } catch(IOException e) {
            System.out.println("Unable to write");
            e.printStackTrace();
        }
    }


}
