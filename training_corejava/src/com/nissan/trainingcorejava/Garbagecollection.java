package com.nissan.trainingcorejava;

public class Garbagecollection {

	public void finalize() {
		System.out.println("Object is garbage collected");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Garbagecollection g1 = new Garbagecollection();
		
		Garbagecollection g2 = new Garbagecollection();
		
		g1=null;
		g2=null;
		System.gc();
	}

}
