package com.nissan.trainingcorejava;

public class Threadtest3 {

	public void run() {
		for (int i=1;i<=5;i++) {
			try {
				Thread.sleep(3000);
			}catch (Exception e) {
				System.out.println(e);
				// TODO: handle exception
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Testingjoin t1 = new Testingjoin();
		Testingjoin t2 = new Testingjoin();
		Testingjoin t3 = new Testingjoin();
		t1.start();
		
		try {
			t1.join();
		}catch(Exception e) {
			System.out.println(e);
			
		}
		t2.start();
		t3.start();

	}
}
