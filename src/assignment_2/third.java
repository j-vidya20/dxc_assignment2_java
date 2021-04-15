package assignment_2;

import java.util.Scanner;

public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array"); 
		
		int size=sc.nextInt();
		
		String myArray[]  = new String [size];
		System.out.println("enter array");
		
		for(int i=0; i<size; i++)
		{
		myArray[i] = sc.nextLine();
		}

		
		 
        for (int i = 0; i < myArray.length-1; i++)
        {
            for (int j = i+1; j < myArray.length; j++)
            {
                if( (myArray[i].equals(myArray[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+myArray[j]);
                }
            }
        }

	}

}
