package assignment_2;

import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		int myArray[]  = new int [100];
		System.out.println("enter array");
		
		for(int i=0; i<100; i++)
		{
		myArray[i] = sc.nextInt();
		}
	}

}
