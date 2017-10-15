package com.dennisdaubney;

public class Main {

    public static void main(String[] args) {
        //width of int = 32 (4 bytes)
	int myIntValue = 5 / 3;

	// width of float = 32 (4 bytes)
	float myFloatValue = 5f / 3f;

	// width of double = 64 (8 bytes)
	double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //Challenge starts here
        double numPounds = 10d;
        double convertedKilograms = numPounds * 0.45359237d;
        //double findOneKilogram = 1 / onePoundToKilograms;
        System.out.println("Kilograms = " + convertedKilograms);
        //4.53592


    }
}
