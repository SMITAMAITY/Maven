package com.lti;

public class Main {

	public static void main(String[] args) {
		Calcy obj = new CalcyImpl();
		int result = obj.add(1000, 10011);
		System.out.println("result"+ result);

	}

}
