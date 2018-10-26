package com.nissan.trainingcorejava;

class Print1 {
	synchronized void printvalue(int a) {
//		synchronized (this) {
//			
//		}  --Use for synchronisation of a specific block for example only below loop can be selected and synchronised
		for(int i=1;i<=5;i++) {
			System.out.println(a*i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Threadone extends Thread{
	Print1 p;
	Threadone(Print1 p){
		this.p=p;
	}
	
	public void run() {
		p.printvalue(5);
	}
}

class Threadtwo extends Thread{
	Print1 p;
	Threadtwo(Print1 p){
		super();
		this.p=p;
	}
	public void run() {
		p.printvalue(100);
		
	}
}

public class Synchronisation1 extends Thread {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Print1 obj = new Print1();
		Threadone t1= new Threadone(obj);
		Threadtwo t2= new Threadtwo(obj);
		
		t1.start();
		t2.start();
	}

}
