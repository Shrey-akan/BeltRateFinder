package com.belt;

public abstract class BeltR {
	protected double inchrate;
	public abstract void getRate();
	
	public double calculatePrice(double size , double qnty) {
		double amount = size*qnty*inchrate;
		System.out.println("Bill is "+amount);
		return amount;
	}
	public void getBilll(double sum) {
		System.out.println("Total Bill is  "+sum);
	}
}
