package com.java;

import java.util.Objects;

public class ObjectsApp {

    // create static class Data
    public static class Data {
        private String data;

        public Data(String data) {
            this.data = data;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Data data1 = (Data) o;

            return data.equals(data1.data);
        }

        @Override
        public int hashCode() {
            return data.hashCode();
        }

        @Override
        public String toString() {
            return "Data{" +
                    "data='" + data + '\'' +
                    '}';
        }
    }

    // main class
    public static void main(String[] args) {

        // bagaimana kalau misalnya kita memanggil method tetapi mengirim datanya null ?

        // kalau di running pasti Error NullPointerException,
        // karena mengirim parameter yang akan dikonversi menjadi string
        // execute(null);

        // jadi harus mengirim datanya, tidak boleh null
        execute(new Data("Bayu"));

        // dengan sudah ditambahkan Objects Class di method execute,
        // maka tidak ada error NullPointer jika mengirimkan data null
        execute(null);
    }

    // create method static execute()
    public static void execute(Data data){

        // untuk mengatasi pengiriman parameter yang null adalah dengan cara dicek dahulu
        if (data != null) {
            System.out.println(data.toString());
            System.out.println(data.hashCode());
        }
        
        // Dengan menggunakan Objects Class tidak perlu melakukan pengecekan
        // jadi bisa langsung panggil Class Objects dan method toString()
        System.out.println(Objects.toString(data));
        System.out.println(Objects.hashCode(data));
    }
}
