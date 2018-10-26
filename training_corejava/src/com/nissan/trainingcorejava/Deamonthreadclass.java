package com.nissan.trainingcorejava;

public class Deamonthreadclass extends Thread {
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("deamon is working");
		}
		else {
			System.out.println("User thread is working");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deamonthreadclass dm = new Deamonthreadclass();
		Deamonthreadclass dm2 = new Deamonthreadclass();
		Deamonthreadclass dm3 = new Deamonthreadclass();
		
		dm.setDaemon(true);//Sets dm as deamon
		
		dm.start();
		dm2.start();
		dm3.start();

	}

}
