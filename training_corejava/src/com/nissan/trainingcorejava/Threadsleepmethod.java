package com.nissan.trainingcorejava;

public class Threadsleepmethod extends Thread{
	
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Threadsleepmethod t1 = new Threadsleepmethod();
		Threadsleepmethod t2 = new Threadsleepmethod();
		t1.run();
		t2.run();
		}

}
