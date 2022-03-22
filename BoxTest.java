package com.training.cg;

import java.util.Scanner;

public class BoxTest {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int b=sc.nextInt();
		int h=sc.nextInt();
		Box box=new Box(l,b,h);
		Box bb=new Box(box);
		System.out.println("The  Box Volume is :"+box.volume());
			
	}

}