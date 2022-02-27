package com.java;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {

        String original = "Bayu Bagus Bagaswara";

        // Encode
        // dari string original jadikan ke bytes dulu, kemudian baru di encode

        // hasilnya adalah string berupa code
        String encoded = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println(encoded);

        // Decode
        // bisa diubah lagi dari code menjadi sebuah String

        // hasilnya adalah byte yang disimpan dalam array
        byte[] bytes = Base64.getDecoder().decode(encoded);

        // untuk mengubah dari byte ke string
        String result = new String(bytes);

        System.out.println(result);
    }
}
