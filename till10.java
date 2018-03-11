package com.qa.General;

public class till10 {
	public void print(int n){
		if(n==0){
		return ;	
		}
		else{
			print(n-1);
	System.out.print(n);		
		}
	}

	public static void main(String[] args) {
		 till10 t = new  till10();
		 t.print(10);
	}

}
