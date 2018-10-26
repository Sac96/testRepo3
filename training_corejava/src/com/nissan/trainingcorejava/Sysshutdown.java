package com.nissan.trainingcorejava;

import java.io.IOException;

public class Sysshutdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Runtime.getRuntime().exec("C:\\Windows\\System32\\shutdown -s -t 0");

	}

}
