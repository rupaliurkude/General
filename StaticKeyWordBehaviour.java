package com.qa.General;

public class StaticKeyWordBehaviour {
	//variable can be initiolized only once;
	static int i ;

	public StaticKeyWordBehaviour(int i){
		this.i =i;
		System.out.println("this is the static 2nd execution constructor"+i);
	}
	//no need for object creation.
public static void Add(int i,int b){
	int sum = i+b;
	System.out.println("this is the static method 3rd execution "+sum);
}
//static block will be executed 1st even before the constructor.
static{
	int a = 10;
	int b= 20;
	System.out.println("is the static block 1st execution"+"a"+a+"b"+b);
}
	
	public static void main(String[] args) {
		StaticKeyWordBehaviour s = new StaticKeyWordBehaviour(10);
		Add(20,20);
		
	}

}
