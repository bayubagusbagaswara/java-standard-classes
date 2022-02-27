package com.java;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {

        // Arrays berisi method static untuk manipulasi data array, seperti pencarian dan pengurutan
        int[] numbers = {
                1, 4, 234, 5, 6, 19, 23, 12, 89, 55
        };

        // mengurutkan isi data array, hasilnya array numbers sudah terurut
        Arrays.sort(numbers);

        // toString untuk konversi data array menjadi string
        System.out.println(Arrays.toString(numbers));

        // mencari data di array menggunakan binarySearch()
        System.out.println(Arrays.binarySearch(numbers, 19));
        System.out.println(Arrays.binarySearch(numbers, 234));

        // copy data array numbers, tetapi hanya 5 data dari index-0 sampai index-4
        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));

        // mengambil data array range, mulai dari data ke-5 sampai data ke-10
        int[] result2 = Arrays.copyOfRange(numbers, 5, 10);
        System.out.println(Arrays.toString(result2));
    }
}
