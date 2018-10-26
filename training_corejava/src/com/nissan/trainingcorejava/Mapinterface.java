package com.nissan.trainingcorejava;
import java.util.*;

public class Mapinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Map<Integer,String> map =new HashMap<Integer,String>();
		
//		LinkedHashMap<Integer,String> map =new LinkedHashMap<Integer,String>();
		
//		TreeMap<Integer,String> map =new TreeMap<Integer,String>();
		
		TreeMap<Integer,String> map =new TreeMap<Integer,String>();
		
		map.put(100, "Sam");
		map.put(105, "Vishnu");
		map.put(103, "Jithin");
		
		for(Map.Entry m:map.entrySet()) { //Method conversion
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
