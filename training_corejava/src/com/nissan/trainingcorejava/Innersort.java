package com.nissan.trainingcorejava;

public class Innersort {
	
	
	class Innersort2{
		int temp;
		void sort() {
			int arr[]= {1,3,4,2,5};
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]>arr[j]){
						temp= arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
