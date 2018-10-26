package com.nissan.trainingcorejava;

interface Writable{
	void write();
	interface Readable{
		void read();
	}
}

public class Nestinterface implements Writable.Readable {

	public void  read() {
		System.out.println("I am reading");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Writable.Readable n= new Nestinterface();
		n.read();
	}

}
