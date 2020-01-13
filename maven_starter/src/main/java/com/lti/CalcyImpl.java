package com.lti;

public class CalcyImpl implements Calcy{

	@Override
	public int add(int num1, int num2) throws IllegalArgumentException {
		if(num1<=0 || num2<=0){
			throw new IllegalArgumentException();
		}
		return num1+num2;
	}

	@Override
	public double div(int num1, int num2) throws IllegalArgumentException {
		if(num1<=0 || num2<=0){
			throw new IllegalArgumentException();
		}
		return num1 / num2;
	}

	
	
}


