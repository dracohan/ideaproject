package com.company;

/**
 * Created by bwhan on 2015/2/26.
 */


//: Parcel4.java
// Nesting a class within a method
public class Parcel4 {
    public Destination dest(String s) {
        class PDestination
                implements Destination {
            private String label;
            private PDestination(String whereTo) {
                label = whereTo;
            }
            public String readLabel() { return label; }
        }
        return new PDestination(s);
    }
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Destination d = p.dest("Tanzania");
    }
} ///:~