package assignment_2;
class Rectangle
{
	
	int height,width;

	public int area()
	{
		return height*width;
	}
}

public class SomethingIsWrong{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Rectangle myRect = new Rectangle();
	        myRect.width = 40;
	        myRect.height = 50;
	        System.out.println("myRect's area is " + myRect.area());

		}


	


