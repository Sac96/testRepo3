package com.nissan.trainingcorejava;

public class Evenoddinner {

	int nums[]= {1,2,3,4,5,6};
	int[] odd = new int[6];
	int[] even = new int[6]; 

	
	void check() {
	class Evnoddcheck{
		void display() {
			int ev=0,od=0;
			for(int i=0;i<nums.length;i++) {
				if(nums[i]%2==0) {
					even[ev++]=nums[i];
				}
				else {
					odd[od++]=nums[i];
				}
			}
			for(int i=0;i<od;i++) {
				System.out.println("Odd numbers are:"+odd[i]);
			}
			for(int i=0;i<ev;i++) {
				System.out.println("Even numbers are:"+even[i]);
			}
		}
	}
	Evnoddcheck I = new Evnoddcheck();
	I.display();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Evenoddinner li=new Evenoddinner();
		li.check();
	}

}
