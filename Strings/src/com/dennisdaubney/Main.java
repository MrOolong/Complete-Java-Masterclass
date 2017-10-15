package com.dennisdaubney;

public class Main {

    public static void main(String[] args) {

        String mystring = "This is a string";

        System.out.println("myString is equal to " + mystring);
        mystring = mystring + ", and this is more.";
        System.out.println("myString is equal to " + mystring);
        mystring = mystring + " \u00A9 2015";
        System.out.println("myString is equal to " + mystring);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Lastring is equal to " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("Lastring value: " + lastString);
    }
}
