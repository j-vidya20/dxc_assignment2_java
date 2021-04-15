package assignment_2;
import java.util.Scanner;

public class first {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array"); 
		
		int size=sc.nextInt();
		
		int myArray[]  = new int [size];
		System.out.println("enter array");
		
		for(i=0; i<size; i++)
		{
		myArray[i] = sc.nextInt();
		}
		
		System.out.println("enter the value you want to search");
		
		
		
		int num=sc.nextInt();
	      try {

	      for( i = 0; i<=myArray.length; i++){
	         if(num == myArray[i]){
	            System.out.println("Array contains the given element");
	         }
	         

	         
	      }
	      
	      
	      
	      
	      
	}
	      
	      catch(ArrayIndexOutOfBoundsException e) {    
	    	  System.out.println("Array  does not contains the given element");
	      }
	}
	

}
