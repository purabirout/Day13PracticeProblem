package com.day13Practice.demo;

import java.util.Scanner;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter first Integer Value");
		Integer a = scn.nextInt();
		System.out.println("Enter second Integer Value");
		Integer b = scn.nextInt();
		System.out.println("Enter third Integer Value");
		Integer c = scn.nextInt();
		
		MaxVariable maxVariable = new MaxVariable();
		display(maxVariable.maximum(a, b, c));
			
	}
	
	public static void display(Integer max) {
		System.out.println("The Maximum Integer is " + max);
	}
	}
