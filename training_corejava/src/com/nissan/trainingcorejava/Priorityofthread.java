package com.nissan.trainingcorejava;

public class Priorityofthread extends Thread{
	
	public void run() {
		System.out.println("Thread name is:" +Thread.currentThread().getName());
		System.out.println("Thread priority is:" +Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Priorityofthread p1 =new Priorityofthread();
		Priorityofthread p2 =new Priorityofthread();
		
		p1.setPriority(Thread.MIN_PRIORITY);
		p2.setPriority(Thread.MAX_PRIORITY);
		
		p1.start();
		p2.start();

	}

}
