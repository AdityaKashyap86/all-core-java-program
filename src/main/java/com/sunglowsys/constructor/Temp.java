package com.sunglowsys.constructor;

public class Temp {
    Temp () {
        System.out.println ("Default");
    }
     Temp (int x) {
        this();
         System.out.println (x);
     }

     Temp(int x, int y) {
         this();
         System.out.println (x * y);
     }

    public static void main(String[] args) {
        new Temp (8,6);
    }
}
