package com.edu;

import java.util.Scanner;

public class fact 
	{
	public static void main(String[] args)
	{
	 int num;
	
	 Scanner sc=new Scanner(System.in);
	 System.out.print("enter number");
	 num=sc.nextInt();
	
	 for(int i=1;i<=num;i++)
	 {
	 if(num%i==0)
	 {
	 System.out.println(i+"");
	 
	}

}
}
	}