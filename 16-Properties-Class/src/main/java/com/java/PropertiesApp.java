package com.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {

        // Perlu diingat kalau Properties Class ini memerlukan try catch
        // karena berhubungan dengan membaca/menulis sebuah file

        // Load File
        try {
            Properties properties = new Properties();

            // load dari file application.properties
            properties.load(new FileInputStream("application.properties"));

            // ambil property (Load) tergantung key nya apa
            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);
        } catch (FileNotFoundException exception) {
            System.out.println("File tidak diketemukan");
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("Gagal load data dar file");
        }

        // Buat data properties baru
        // jadi kita akan buat file name.properties secara otomatis
        try {
            // menambah data properties baru gunakan method put
            Properties properties = new Properties();
            properties.put("name.first", "Bayu");
            properties.put("name.middle", "Bagus");
            properties.put("name.last", "Bagaswara");

            // untuk menyimpan data propertie diatas, gunakan method store
            properties.store(new FileOutputStream("name.properties"), "Konfigurasi Nama");

        } catch (FileNotFoundException exception) {
            System.out.println("Error membuat file properties");

        } catch (IOException e) {
            System.out.println("Error menyimpan properties");
        }
    }
}
