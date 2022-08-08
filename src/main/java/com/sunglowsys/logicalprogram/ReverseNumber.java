package com.sunglowsys.logicalprogram;

public class ReverseNumber {
    public static void main(String[] args) {
        int num  = 12345, rev = 0, remain;
        while (num != 0 ) {
            remain = num%10;
            rev = rev*10+remain;
            num = num/10;
        }
        System.out.println ();
    }

}
