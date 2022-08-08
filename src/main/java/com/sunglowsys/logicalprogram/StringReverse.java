package com.sunglowsys.logicalprogram;

public class StringReverse {
    public static void main(String[] args) {
        String name = "sunglowsys";
        int length = name.length ();
        String revrse = "";
        for (int i= length-1; i>=0; i--) {
           revrse= revrse+name.charAt (i);
        }
        System.out.println (revrse);
    }
}
