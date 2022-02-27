package com.java;

import java.util.UUID;

public class UUIDApp {

    public static void main(String[] args) {

        // misal kita ingin buat UUID sebanyak 100 data menggunaka perulangan
        for (int i = 0; i < 100; i++) {
            // create UUID
            UUID uuid = UUID.randomUUID();

            // konversi uuid menjadi string
            String key = uuid.toString();

            // cetak string nya
            System.out.println(key);
        }
    }
}
