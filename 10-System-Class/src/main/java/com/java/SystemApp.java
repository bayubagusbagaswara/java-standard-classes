package com.java;

public class SystemApp {
    public static void main(String[] args) {

        // ingin melihat current time millis
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        // melihat environment variable
        System.out.println(System.getenv());
        System.out.println(System.getenv("APP"));
        
        // garbage collection
        System.gc();

        // exit program java
        System.exit(0);
    }
}
