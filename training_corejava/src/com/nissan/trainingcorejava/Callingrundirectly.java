package com.nissan.trainingcorejava;

public class Callingrundirectly extends Thread {

	public void run() {
		System.out.println("Thread run");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Callingrundirectly t = new Callingrundirectly();
		t.run();

	}

}
