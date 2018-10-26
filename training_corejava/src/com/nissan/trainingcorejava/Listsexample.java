package com.nissan.trainingcorejava;

import java.util.*;



public class Listsexample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> listone = new ArrayList();
		LinkedList<String> listtwo = new LinkedList();
		HashSet<String> listthree = new HashSet();
		LinkedHashSet<String> listfour= new LinkedHashSet();
		listone.add("Sam");
		listone.add("Pam");
		listtwo.add("9876");
		listtwo.add("8765");
		listthree.add("26");
		listthree.add("29");
		listfour.add("1993");
		listfour.add("1994");
		
		ArrayList<String> list1 = new ArrayList <String>();
		list1.addAll(listone);
		Iterator i = listone.iterator();
		while(i.hasNext()) {
		   System.out.println(i.next());
		}
		
		LinkedList<String> list2 = new LinkedList <String>();
		list2.addAll(listtwo);
		Iterator l = listtwo.iterator();
		while(l.hasNext()) {
		   System.out.println(l.next());
		}
		
		HashSet<String> list3 = new HashSet <String>();
		list3.addAll(listthree);
		Iterator hs = listthree.iterator();
		while(hs.hasNext()) {
		   System.out.println(hs.next());
		}
		
		LinkedHashSet<String> list4 = new LinkedHashSet <String>();
		list4.addAll(listfour);
		Iterator lhs = listfour.iterator();
		while(lhs.hasNext()) {
		   System.out.println(lhs.next());
		}

		 
	}

}
