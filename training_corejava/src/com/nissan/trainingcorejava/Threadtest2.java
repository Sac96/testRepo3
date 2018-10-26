package com.nissan.trainingcorejava;

public class Threadtest2 extends Thread {

	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println("first"+i);
		}
		for(int i=5;i<10;i++) {
			System.out.println("second"+i);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Threadtest2 t2 = new Threadtest2();
        Threadtest2 t3 = new Threadtest2();
        t2.start();
        t3.start();
	}

}
