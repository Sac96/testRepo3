package com.nissan.trainingcorejava;

class Print2 {
	
	int a[]= {20,30,40,50,60};
	synchronized void printvalue(int aa) {

		for(int i=0;i<=a.length;i++) {
			
			
			System.out.println(a[i]);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Thread1 extends Thread{
	Print2 p;
	Thread1(Print2 p){
		this.p=p;
	}
	
	public void run() {
		p.printvalue(6);
	}
}

class Thread2 extends Thread{
	Print2 p;
	Thread2(Print2 p){
		super();
		this.p=p;
	}
	public void run() {
		p.printvalue(100);
		
	}
}

public class Synchronisation2 extends Thread {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Print2 obj = new Print2();
		Thread1 t1= new Thread1(obj);
		Thread2 t2= new Thread2(obj);
		
		t1.start();
		t2.start();
	}

}

