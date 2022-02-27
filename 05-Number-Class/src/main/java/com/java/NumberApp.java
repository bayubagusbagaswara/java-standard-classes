package com.java;

public class NumberApp {
    public static void main(String[] args) {

        Integer intValue = 10;

        // Konversi ke tipe data Number yang lainnya
        // ini untuk non primitif, jadi lebih enak untuk melakukan konversi

        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        // Konversi String ke Number
        // tapi string ini harus berupa angka, jika ada karakter/huruf maka tidak bisa dikonversi, dan akan lempar exception

        String string = "10000";

        // konversi ke tipe data number object atau non-primitive
        Integer integer = Integer.valueOf(string);

        // konversi ke tipe data number primitive
        int integerPrimitive = Integer.parseInt(string);

        System.out.println(integer);
        System.out.println(integerPrimitive);
    }
}
