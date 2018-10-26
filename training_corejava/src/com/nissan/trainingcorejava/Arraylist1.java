package com.nissan.trainingcorejava;
import java.util.*;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list = new ArrayList<String>();
list.add("Arun");
list.add("Sam");
list.add("Pam");
//list.remove("");
ArrayList<String> listone = new ArrayList <String>();
listone.addAll(list);

Iterator i = list.iterator();

Iterator m = list.iterator();

while(i.hasNext()) {
//	System.out.println(i.next());
}

while(i.hasNext()) {
	System.out.println(m.next());
}
	}

	 
	
}
