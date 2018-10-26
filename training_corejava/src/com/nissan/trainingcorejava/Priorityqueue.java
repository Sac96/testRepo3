package com.nissan.trainingcorejava;

import java.util.PriorityQueue;

public class Priorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq= new PriorityQueue<String>();
		
		pq.add("Ram");
		pq.add("Siva");
		
		System.out.println("head"+pq.element());
		System.out.println("head"+pq.peek());
		
		for(String s:pq) {
			System.out.println(s);
		}
		System.out.println("Removing");
		
		pq.remove();
		for(String s:pq) {
			System.out.println(s);
		}

	}

}
