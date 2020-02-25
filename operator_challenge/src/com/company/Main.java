package com.company;

public class Main {

    public static void main(String[] args) {
	double value = 20.00d;
	double second_value = 80.00d;

	double result = 100.00d* ( value + second_value);

	double remainder = result % 40.00d;

	System.out.println("the remainder is : " + remainder);

	boolean isNoRemainder = (remainder == 0) ? true: false;
	System.out.println("is no remainder " + isNoRemainder);
	if(!isNoRemainder){
        System.out.println("got some remainder.");
    }

    }
}
