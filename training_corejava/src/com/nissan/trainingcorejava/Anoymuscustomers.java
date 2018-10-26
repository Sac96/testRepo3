package com.nissan.trainingcorejava;

abstract class anonycust{
	abstract void cust();
}

public class Anoymuscustomers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c = new Customer() {
			void name() {
			String arr[]= {"Rahul","Arun","Jobin","Lalu"};	
			String temp;
			
			 for(int i=0; i<arr.length; i++)
		        {
		            for(int j=1; j<arr.length; j++)
		            {
		                if(arr[j-1].compareTo(arr[j])>0)
		                {
		                    temp=arr[j-1];
		                    arr[j-1]=arr[j];
		                    arr[j]=temp;
		                }
		            }
		        }
			
			System.out.println("Sorted lists are:");
			
			 for(int i=0;i<arr.length;i++)
		        {
		            System.out.println(arr[i]);
		        }
			}
		};
		c.name();
		
	}

}
