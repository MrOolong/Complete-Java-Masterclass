package com.dennisdaubney;

public class Main {

    public static void main(String[] args) {

    //int has a width of 32
	int myMinValue = -2_147_483_648;
	int myMaxValue = 2_147_483_647;
	int myTotal = (myMinValue/2);
        System.out.println("My Total = " + myTotal);
        //For integers, the largest number can go up into the 2 billions

    //byte has a width of 8
	byte myByteValue = -128;
	byte myNewByteValue = (byte)(myByteValue/2);
		System.out.println("myNewByteValue = " + myNewByteValue);
		//Bytes are numbers only within the range of -128 to 127.
        // They are best used on mobile or computers with small amounts of memory
        //Integers in comparison take up more space in memory

    //short has a width of 16
	short myShortValue = 32767;
	short myNewShortValue = (short) (myShortValue / 2);
		System.out.println("myNewShortValue = " + myNewShortValue);
	//shorts -32768 & 32767 - allocated space twice that of byte and half that of integer

    //long has a width of 64 - can store 2^63
    long myLongValue = 100L;
    long myNewLongValue = (myLongValue / 2);

    //CHALLENGE STARTS HERE
	byte validByte = 100;

	short validShort = 200;

	int validInt = 500;

	long longTotal = 50_000L + 10 * (validByte + validShort + validInt);
	short shortTotal = (short) (1000 + 10 * (validByte + validShort + validInt)); //(short) is called casting
		System.out.println(longTotal);
		System.out.println(shortTotal);
	}
}
