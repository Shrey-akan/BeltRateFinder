package com.belt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BeltC bc = new BeltC();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome To Our Shop");
		System.out.println("Bharat Trading Company");
		System.out.println("Start Purchasing  ");
		double sum =0;
		while(true) {
			System.out.println("1.A \n2.B \n3.C \n4.D  \n5.E \n6.Bill  \n7.Add More \n8.Exit");
			int ch = Integer.parseInt(br.readLine());
			if(ch==1) {
				System.out.println("Enter the size ");
				double size = Integer.parseInt(br.readLine());
				System.out.println("Enter the Quantity ");
				double quanty = Integer.parseInt(br.readLine());
				BeltR rc = bc.getBelt("A");
				rc.getRate();
				double amount = rc.calculatePrice(size, quanty);
				sum = sum+amount;
			}
			else if(ch==2) {
				System.out.println("Enter the size ");
				double size = Integer.parseInt(br.readLine());
				System.out.println("Enter the Quantity ");
				double quanty = Integer.parseInt(br.readLine());
				BeltR rc = bc.getBelt("B");
				rc.getRate();
				double amount = rc.calculatePrice(size, quanty);
				sum = sum+amount;
			}
			else if(ch==3) {
				System.out.println("Enter the size ");
				double size = Integer.parseInt(br.readLine());
				System.out.println("Enter the Quantity ");
				double quanty = Integer.parseInt(br.readLine());
				BeltR rc = bc.getBelt("C");
				rc.getRate();
				double amount = rc.calculatePrice(size, quanty);
				sum = sum+amount;
			}
			else if(ch==4) {
				System.out.println("Enter the size ");
				double size = Integer.parseInt(br.readLine());
				System.out.println("Enter the Quantity ");
				double quanty = Integer.parseInt(br.readLine());
				BeltR rc = bc.getBelt("D");
				rc.getRate();
				double amount = rc.calculatePrice(size, quanty);
				sum = sum+amount;
			}
			else if(ch==5) {
				System.out.println("Enter the size ");
				double size = Integer.parseInt(br.readLine());
				System.out.println("Enter the Quantity ");
				double quanty = Integer.parseInt(br.readLine());
				BeltR rc = bc.getBelt("E");
				rc.getRate();
				double amount = rc.calculatePrice(size, quanty);
				sum = sum+amount;
			}
			else if(ch==6) {
				BeltR rc = bc.getBelt("Bill");
				rc.getBilll(sum);
				
			}
			else if(ch==7) {
				System.out.println("Enter the Section of Belt");
				String str = br.readLine();
				System.out.println("Enter the size of belt");
				double size = Integer.parseInt(br.readLine());
				System.out.println("Enter the quantity");
				double qnty = Integer.parseInt(br.readLine());
				BeltR rrr = bc.getBelt(str);
				rrr.getRate();
				double price = rrr.calculatePrice(size, qnty);
				sum = sum + price;
			}
			else if(ch==8) {
				System.out.println("Total Bill is "+sum+" \nThanks For Shopping ");
				break;
			}
			else {
				System.out.println("Choose valid option ");
			}
			
			
			
			
			
			
			
			
		}
	}

}
