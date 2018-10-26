package com.nissan.trainingcorejava;

public class Threadtest1 extends Thread {
	
	public void run() {
		System.out.println("Thread one running");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Threadtest1 t1=new Threadtest1();
		Threadtest1 t2=new Threadtest1();
		t1.start();
		t2.run();

	}

}
