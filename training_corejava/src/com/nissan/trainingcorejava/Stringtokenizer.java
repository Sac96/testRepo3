package com.nissan.trainingcorejava;

import java.util.StringTokenizer;

public class Stringtokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringTokenizer st = new StringTokenizer("Name is Nissan");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
