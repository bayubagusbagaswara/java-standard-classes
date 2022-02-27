package com.java;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {

        // create object scanner
        // jika input nilainya dari console maka kita inputkan System.in
        // jika berupa input file, maka tulis nama filenya
        Scanner scanner = new Scanner(System.in);

        // kita mau ambil data nama saat user menginputkan di terminal
        System.out.print("Nama : ");

        // nextLine() untuk mengambil data string
        // artinya setelah ditekan Enter, maka scanner baru membaca inputnya
        String name = scanner.nextLine();

        // kalau ingin ambil datanya integer
        // scanner.nextInt();

        // kalau ingin ambil datanya boolean
        // scanner.nextBoolean();

        System.out.print("Umur : ");
        Integer age = scanner.nextInt();

        System.out.println("Hello " + name + " umur anda adalah " + age);
    }
}
