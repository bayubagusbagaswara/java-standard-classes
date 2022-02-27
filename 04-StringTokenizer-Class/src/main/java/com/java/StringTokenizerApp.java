package com.java;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {

        // Jika ingin melakakukan split terhadap file yang besar, maka ini lebih hemat memori daripada split
        // StringTokenizer bersifat Lazy, karena ini motong nya dikit-dikit
        // Jika di panggil nextToken(), maka dia baru memotong string nya

        // create object string
        String fullName = "Bayu Bagus Bagaswara";

        // create object string tokenizer
        // masukkan data string yang akan di split
        // bisa juga menambahkan delimiter nya
        StringTokenizer tokenizer = new StringTokenizer(fullName, " ");

        // tokenizer.hasMoreTokens(); // kalau masih ada datanya, return nya akan true

        // bikin perulangan untuk mengambil data string hasil split
        // perulangan akan berhenti jika balikan dari hasMoreTokens() ini bernilai False

        while(tokenizer.hasMoreTokens()){
            // potong token nya, lalu simpan string nya ke variable name
            String name = tokenizer.nextToken();
            // cetak name
            System.out.println(name);
        }
    }
}
