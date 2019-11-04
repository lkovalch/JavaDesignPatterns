package com._11singleton;

public class TestLogger {

	public static void main(String[] args) {
		
		Logger obj1 = Logger.getInstance();
		Logger obj2 = Logger.getInstance();
		
		System.out.println(obj1.hashCode()); //printed code number will be the same on both cases, 
		System.out.println(obj2.hashCode()); //which means its the same object
}}