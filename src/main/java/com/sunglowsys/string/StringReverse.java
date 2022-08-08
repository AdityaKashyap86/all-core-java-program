package com.sunglowsys.string;

/*In this class we are creating reverse lass*/
//Class name
public class StringReverse {
//    This is main method creating

    public static void main(String[] args) {

//     Give String name
        String name = "SUNGLOWSYS";
        int lenght = name.length ();

//        Empty String creating
        String revName = "";

//      By using for loop
        for (int i=lenght-1; i>=0; i--){
            revName=revName+name.charAt (i);
        }
        System.out.println (revName);
    }
}

