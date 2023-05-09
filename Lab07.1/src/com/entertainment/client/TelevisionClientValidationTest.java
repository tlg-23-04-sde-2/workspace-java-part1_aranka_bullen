package com.entertainment.client;

import com.entertainment.Television;

class TelevisionClientValidationTest {
    public static void main(String[] args){
        Television tv = new Television();

        tv.setVolume(-1);
        System.out.println(tv.getVolume());
        System.out.println();

        tv.setVolume(0);
        System.out.println(tv.getVolume());
        System.out.println();

        tv.setVolume(1);
        System.out.println(tv.getVolume());
        System.out.println();

        tv.setVolume(100);
        System.out.println(tv.getVolume());
        System.out.println();

        tv.setVolume(101);
        System.out.println(tv.getVolume());
        System.out.println();

        tv.setBrand("Samsung");
        System.out.println(tv.getBrand());
        System.out.println();

        tv.setBrand("LG");
        System.out.println(tv.getBrand());
        System.out.println();

        tv.setBrand("Toshiba");
        System.out.println(tv.getBrand());
        System.out.println();

        tv.setBrand("Sony");
        System.out.println(tv.getBrand());
        System.out.println();

        tv.setBrand("Invalid");
        System.out.println(tv.getBrand());
        System.out.println()
        ;
    }
}