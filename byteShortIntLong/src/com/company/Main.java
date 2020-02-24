package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue= 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMax = Integer.MAX_VALUE;
        System.out.println("integer minimum value: " + myMinIntValue);
        System.out.println("integer max value: " + myMax);
        System.out.println("busted" + (myMax + 1));
        int mynumber = 2147483647;

        byte miMinByteValue = Byte.MIN_VALUE;
        byte miMaxByteValue = Byte.MAX_VALUE;

        System.out.println("byte max value is :" + (miMaxByteValue + 1));
        System.out.println("byte min value is :" + (miMinByteValue - 1));


        short miMinshortValue = Short.MIN_VALUE;
        short miMaxshortValue = Short.MAX_VALUE;

        System.out.println("Short max value is :" + (miMaxshortValue + 1));
        System.out.println("Short min value is :" + (miMinshortValue - 1));

        long miMinlongValue = Long.MIN_VALUE;
        long miMaxlongValue = Long.MAX_VALUE;

        System.out.println("Long max value is :" + (miMaxlongValue + 1));
        System.out.println("Long min value is :" + (miMinlongValue - 1));

        byte myNewByte = (byte)(miMinByteValue / 2);

    }
}
