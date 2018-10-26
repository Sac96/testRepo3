package com.nissan.trainingcorejava;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("Nissan");
		sb.append("Digital");
		System.out.println(sb);
		
		sb.replace(1, 3, "Hub");
		System.out.println(sb);
		
		sb.delete(1, 4);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.capacity();
		System.out.println(sb.capacity());
		
		sb.append("Digital is the new system");
		System.out.println(sb.capacity());
		
		
	}

}
