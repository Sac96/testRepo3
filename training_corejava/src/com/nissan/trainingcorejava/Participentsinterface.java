package com.nissan.trainingcorejava;
import java.util.*;
import java.lang.*;

interface Participents{
	void display();
}

class th1 extends Thread{
Participentsinterface p;

th1(Participentsinterface p){
	this.p=p;
}
public void run() {
//	p.printvalue(6);
}
}

class th2 extends Thread{
	Participentsinterface p;

	th2(Participentsinterface p){
		this.p=p;
	}
	public void run() {
//		p.printvalue(6);
	}
}

public class Participentsinterface extends Thread {

	static String arr[]=new String[10];
	static int flag=0;
	void show() {
		if(flag==1) {
			
		}
	}
	
	
	synchronized void printvalue(int aa) {

			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc =new Scanner(System.in);
		
		Printdisplay p1=() ->{
			System.out.println("Enter number of names:");
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				arr[i]=sc.next();
			}
			Arrays.parallelSort(arr,0,n);
			System.out.println("Sorted array");
			for(int i=0;i<n;i++) {
				System.out.println(arr[i]);
			}
		};
		p1.display();
		
		
		Participentsinterface obj = new Participentsinterface();
		th1 t1= new th1(obj);
		th2 t2= new th2(obj);
		
		t1.start();
		t2.start();

	}

}
