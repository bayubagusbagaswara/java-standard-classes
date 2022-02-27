package com.java;

public class RuntimeApp {

    public static void main(String[] args) {

        // panggil class Runtime
        Runtime runtime = Runtime.getRuntime();

        // processor yang tersedia
        System.out.println(runtime.availableProcessors());

        // free memory di JVM, bukan diperangkat kita
        System.out.println(runtime.freeMemory());

        // total memory di JVM
        System.out.println(runtime.totalMemory());

        // max memory yang disediakan
        System.out.println(runtime.maxMemory());
    }
}
