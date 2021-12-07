package com.javaeight;

import java.util.Collection;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Greeting helloName = () -> System.out.println("hello bro");
Thread newthread = new Thread(()->System.out.println("heello"));
newthread.run(); 
helloName.Name();
	}public Main() {
		// TODO Auto-generated constructor stub
	}
}
 