package com.immutable;

import java.util.Date;

public class ImmutableMain {

	public static void main(String[] args) {
		
		ImmutableClass immutableClass = ImmutableClass.getInstance(100, "Cant change this", new Date());
		System.out.println("Before: "+immutableClass);

		//try to change the values
		changeValues(immutableClass.getImmutableFld1(), immutableClass.getImmutableFld2(), immutableClass.getMutableFld());;
		System.out.println("After: "+immutableClass);
	}

	private static void changeValues(Integer immutableFld1, String immutableFld2, Date mutableFld) {

		immutableFld1 = 101;
		immutableFld2 = "This is a change";
		mutableFld.setDate(10000);
		
	}
}
