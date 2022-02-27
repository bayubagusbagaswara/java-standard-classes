package com.java;

public class StringBuilderApp {
    public static void main(String[] args) {

        // create variable untuk menyimpan data string biasa
        // setiap manipulasi sebuah String, maka akan dibuatkan String baru
        // Jadi String lama masih ada

        String name = "Bayu";
        name = name + " " + "Bagus";
        name = name + " " + "Bagaswara";
        System.out.println(name);

        // sebenarnya di memory masih ada 3 data name dengan data string yang berbeda
        // nama ke 1 isinya string Bayu
        // name ke 2 isinya string Bayu Bagus
        // name ke 3 isinya string Bagus Bagus Bagaswara

        // jika ingin manipulasi String yang jumlahnya banyak, maka jangan menggunakan String biasa
        // kita bisa menggunakan StringBuilder

        // create object string builder
        StringBuilder builder = new StringBuilder();

        // masukan string "Bayu" ke builder
        builder.append("Bayu");

        // masukan string kosong atau spasi ke builder
        builder.append(" ");

        // masukan string "Bagus" ke builder
        builder.append("Bagus");

        // masukan string kosong atau spasi ke builder
        builder.append(" ");

        // masukan string "Bagaswara" ke builder
        builder.append("Bagaswara");

        // lalu ubah object string builder menjadi object string biasa menggunakan function toString()
        String fullName = builder.toString();
        System.out.println(fullName); // Bayu Bagus Bagaswara
    }
}
