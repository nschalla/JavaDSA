package com.multithreading;



public class MyThread {


	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Runnable t1= () -> System.out.println("Hello wORLD");
//		t1.run();
//		Thread t2 = new Thread(t1);
//		t2.start();
//		
//		
		Runnable walk = () ->{
			for(int i = 0; i < 5; i++) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				System.out.println("Iam Walking.....");
			}
		};
		Runnable chew = () ->{
			for(int i = 0; i < 5; i++) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				System.out.println("Iam Chewing.....");
			}
		};
		
		Thread walkThread = new Thread(walk);
		walkThread.start();
		Thread gewThread = new Thread(chew);
		gewThread.start();
	}

}
