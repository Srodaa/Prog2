package org.example;

public class Runner {
	public static void main(String[] args) {
		Haromszog hsz1;
		try {
			hsz1=new Haromszog(3, 4, 5);
			System.out.println(hsz1);
		} catch (HaromszogExcpetion e) {
			System.out.println(e.toString());
		}
		
		
		
	}
	

}
