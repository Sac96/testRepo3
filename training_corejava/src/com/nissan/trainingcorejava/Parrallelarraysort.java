package com.nissan.trainingcorejava;
import java.util.Arrays;

public class Parrallelarraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {5,8,2,4,3};
		
		for (int i:arr) {
			System.out.println(i+" ");
		}
		
		Arrays.parallelSort(arr);
		System.out.println("Elements after sort");
		
		for (int i:arr) {
			System.out.println(i+" ");
		}

	}

}
