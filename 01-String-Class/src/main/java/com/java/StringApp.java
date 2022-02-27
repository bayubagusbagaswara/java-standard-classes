package com.java;

public class StringApp {
    public static void main(String[] args) {

        // create variable string
        String name = "Albert Einstein";

        // change string to lower case
        String nameLowerCase = name.toLowerCase();
        System.out.println(nameLowerCase);

        // change string to upper case
        String nameUpperCase = name.toUpperCase();
        System.out.println(nameUpperCase);

        // count length characters
        System.out.println(name.length());

        // check string starts, return of boolean
        System.out.println(name.startsWith("Albert"));

        // check string ends, return is boolean
        System.out.println(name.endsWith("Einstein"));

        // Split String
        // artinya satu String bisa di pecah menjadi beberapa, dan disimpan dalam array
        String[] names = name.split(" ");
        for (String value : names) {
            System.out.println(value);
        }

        // cek string blank dan kosong
        // true, karena spasi adalah String tapi datanya blank atau kosong
        System.out.println(" ".isBlank());

        // true, karena tidak ada String alias blank juga
        System.out.println("".isBlank());

        // false, karena spasi termasuk string
        System.out.println(" ".isEmpty());

        // true, karena String nya benar kosong
        System.out.println("".isEmpty());

        // ambil sebuah karakter dari String
        // misalnya ambil character pada index 1
        System.out.println(name.charAt(1));

        // ambil semua karakter dan simpan ke dalam array
        // jadi 1 index array akan diisi 1 character
        char[] chars = name.toCharArray();
        for (var value : chars) {
            System.out.println(value);
        }
    }
}
