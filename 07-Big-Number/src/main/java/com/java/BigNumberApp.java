package com.java;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {

        // BigInteger
        // misal kita bikin nilai long yang melebihi kapasitas maximal nya
        // dan Long tidak bisa menampungya lagi
        Long value = 1000000000000000000L;

        // solusinya pertama kita bisa menggunakan class BigInteger
        BigInteger intA = new BigInteger("1000000000000000000");
        BigInteger intB = new BigInteger("1000000000000000000");

        // penjumlahan menggunakan function add()
        BigInteger intC = intA.add(intB);
        System.out.println(intC);

        // BigDecimal
        // solusi kedua bisa menggunakan BigDecimal, ini untuk floating point
        BigDecimal decimalA = new BigDecimal("1000000000000000000");
        BigDecimal decimalB = new BigDecimal("2.13");

        // perkalian menggunakan function multiply()
        BigDecimal multiply = decimalA.multiply(decimalB);

        System.out.println(multiply);
    }
}
