package com.java;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {

        // create object joiner
        // delimiter adalah pemisah antar string nya
        // prefix adalah awalan
        // suffix adalah akhiran
        StringJoiner joiner = new StringJoiner(",", "[", "]");

        // add string to joiner
        joiner.add("Bayu");
        joiner.add("Bagus");
        joiner.add("Bagaswara");

        // print and convert from joiner to string
        String value = joiner.toString();
        System.out.println(value);
    }
}
