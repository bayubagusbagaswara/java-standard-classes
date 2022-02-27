package com.java;

import java.util.Calendar;
import java.util.Date;

public class DateApp {

    public static void main(String[] args) {

        // Date Class (milik package java.util) hanya sebatas milisecond
        // dan sekarang banyak Method dari Date Class yang sudah deprecated
        // bagi method yang di deprecated itu disarankan menggunakan Calendar Class

        // default tidak memasukkan parameter, dia adalah waktu saat ini dalam milisecond
        Date tanggal = new Date();
        System.out.println(tanggal);

        // kalau mau mengubah tanggal nya
        // maka parameternya harus milisecond, itu yang bikin sedikit susah
        // karena problem dari Date itulah kita menggunakan Calendar Class
        // ada add() untuk menambah/mengurangi waktu/tanggal saat ini

        // create instance object dari Calendar class
        Calendar calendar = Calendar.getInstance();

        // set untuk mengatur calendar, tahun, bulan, tanggal
        calendar.set(Calendar.YEAR, 2010);// artinya ini kita set di tahun 2010
        calendar.add(Calendar.YEAR, -5); // artinya kita set Tahun 2010 (sudah diset diatas dulu) dikurangi 5 tahun kebelakang
        calendar.set(Calendar.MONTH, Calendar.JANUARY); // set bulan menjadi January (kalau memasukkan January = 0)
        calendar.set(Calendar.HOUR_OF_DAY, 10); // set jam menjadi jam 10
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        // Untuk mendapatkan time dari calendarnya cukup panggil method getTime()
        Date result = calendar.getTime();
        System.out.println(result);
    }
}
