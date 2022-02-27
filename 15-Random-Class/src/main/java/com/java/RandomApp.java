package com.java;

import java.util.Random;

public class RandomApp {

    public static void main(String[] args) {

        // create object random
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            // bound adalah nilai maksimal yang kita inginkan
            // akan random dari 0 sampai maksimal 100
            var value = random.nextInt(100);
            System.out.println(value);
        }
    }
}
