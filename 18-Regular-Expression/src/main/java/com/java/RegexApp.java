package com.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {

    public static void main(String[] args) {

        String name = "Bayu Bagus Bagaswara Albert Newton Ludwig";

        // kita akan mencari 3 karakter, dilihat dari tanda [] berjumlah 3
        Pattern pattern = Pattern.compile("[a-zA-Z]*[u][a-zA-Z]*");

        // tanda * adalah jumlah karakternya terserah, bisa 0 atau lebih dari satu, jumlah karakter yg ada di [] didepan *
        // ditengah-tengah harus ada karakter "u"
        // diakhir juga a-z

        Matcher matcher = pattern.matcher(name);

        // untuk mendapatkan hasilnya satu persatu bisa melakukan perulangan
        while (matcher.find()){
            // selama dia menemukan karakternya, maka masukkan ke group
            String result = matcher.group();
            System.out.println(result);
        }
    }
}
