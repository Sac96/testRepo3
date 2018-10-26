package com.nissan.trainingcorejava;

//public class Multithreadingcorejava extends Thread {
public class Multithreadingcorejava implements Runnable {


	public void run() {
		System.out.println("Running a thread");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multithreadingcorejava ml= new Multithreadingcorejava();
//		ml.start();
		
		Thread ml2= new Thread(ml);
		ml2.start();
		
		System.out.println("");

	}

}
