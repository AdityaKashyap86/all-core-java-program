package com.sunglowsys.string;

/*IN this class we are creating ,passing and adding element*/

public class StringConcat {
    // This is main method

    public static void main(String[] args) {

        //Creating object

        String s1= "ADITYA";
        String s2=  new String ("Kashyap");
        String s3= "Amit";
        String s4= "Shivam";

        // using multiple passing array

        String s5=s1.concat("* "+s2).concat ("* "+s3).concat ("* "+s4);
        System.out.println (s5);
    }
}
