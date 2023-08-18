package com.edu;
import java.util.Scanner;
public class Reversenum {
	public static void main(String[]args)
	{
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number");
		num=sc.nextInt();
		
	String Str=String.valueOf(num);
	
	StringBuffer Strb=new StringBuffer(Str);
	System.out.println(Strb.reverse().toString());
	

	}
}
