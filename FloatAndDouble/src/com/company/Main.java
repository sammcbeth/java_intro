package com.company;

public class Main {

    public static void main(String[] args) {

        float miMinFloatVal = Float.MIN_VALUE;
        float miMaxFloatVal = Float.MAX_VALUE;

        System.out.println("float min value: " + miMinFloatVal);
        System.out.println("float max value: " + miMaxFloatVal);


        double miMindoubleVal = Double.MIN_VALUE;
        double miMaxdoubleVal = Double.MAX_VALUE;

        System.out.println("double min value: " + miMindoubleVal);
        System.out.println("double max value: " + miMaxdoubleVal);


        int myIntVal = 5 / 3;
        float myFloatVal = 5f / 3f;
        double mydDoubleVal = 5d / 3f;
        System.out.println("My int val: " + myIntVal);
        System.out.println("My float val: " + myFloatVal);
        System.out.println("My double val: " + mydDoubleVal);
    }
}
