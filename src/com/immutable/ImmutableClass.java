package com.immutable;

import java.util.Date;

final class ImmutableClass {

	private final Integer immutableFld1;
	private final String immutableFld2;
	//mutable fld
	private final Date mutableFld;
	
	//private constructor
	private ImmutableClass(Integer immutableFld1, String immutableFld2, Date mutableFld) {
		this.immutableFld1 = immutableFld1;
		this.immutableFld2 = immutableFld2;
		//this.mutableFld = mutableFld;
		this.mutableFld  = new Date(mutableFld.getDate());
	}
	
	//factory getmethod
	public static ImmutableClass getInstance(Integer immutableFld1, String immutableFld2, Date mutableFld) {
		
		return new ImmutableClass(immutableFld1, immutableFld2, mutableFld);
	}
	
	//no setters
	
	// Integer is immutable
	public Integer getImmutableFld1() {
		return immutableFld1;
	}

	//String is immutable
	public String getImmutableFld2() {
		return immutableFld2;
	}

	// date is MUTABLE- special care
	public Date getMutableFld() {
//		return mutableFld;
		return new Date(mutableFld.getDate());
	}

	@Override
	public String toString() {
		return "ImmutableClass [immutableFld1=" + immutableFld1 + ", immutableFld2=" + immutableFld2 + ", mutableFld="
				+ mutableFld + "]";
	}
	
}
