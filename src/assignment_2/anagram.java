package assignment_2;
import java.util.Scanner;

public class anagram {
	

	    public static boolean areAnagrams(String first,String second) {

	        String a = space(first);
	        String b = space(second);

	

		    a= sort(a);
		    b= sort(b);

	        return a.equals(b);
	    }

	    protected static String space(String string) {
	        int i, len = string.length();
	        StringBuilder dest = new StringBuilder(len);
	  		char c;

		    for (i = (len - 1); i >= 0; i--) {
		        c = string.charAt(i);
		        if (Character.isLetter(c)) {
			        dest.append(c);
		        }
		    }

	        return dest.toString();
	    }

	    protected static String sort(String string) {
		    char[] charArray = string.toCharArray();

		    java.util.Arrays.sort(charArray);

	        return new String(charArray);
	    }

	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	
	    	
	       
	        System.out.println("Enter the strings you want to check");
	        System.out.println("First String:");
	        String first=sc.nextLine();
	        System.out.println("Second String:" );
	        String second=sc.nextLine();
	       

	        if (areAnagrams(first, second)) {
	            System.out.println("The above strings are anagrams");
	        } else {
	            System.out.println("The above strings are not anagrams");
	        }
	        
	    }
	}

