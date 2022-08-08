package com.sunglowsys.constructor;

public class Demo {
    Demo() {
        this (90, 80);
        System.out.println ("Default constructor is calling");
    }

    Demo(int x, int y) {
        System.out.println (" parameterized constructor is calling ");

    }
}class ProtoType extends Demo {
    ProtoType () {
        this("java", "python");
        System.out.println ("Derived class default constructor calling");
    }
    ProtoType(String str,String str1) {
        super();
        System.out.println ("Derived class Parameter constructor is calling");
    }
}
class ConstructorChaining {
    public static void main(String[] args) {
        Demo d = new Demo ();
       // ProtoType pr = new ProtoType ();

    }
}



