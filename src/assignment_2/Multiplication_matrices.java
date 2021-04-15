package assignment_2;

public class Multiplication_matrices {
	public static void main(String[] args) 
		{
			
			int x[][]={{1,2,3},{4,5,6},{7,8,9}};  
			
			int y[][]={{6,8,10},{12,4,5},{3,17,20}}; 
			
			int z[][]=new int[3][3];  
			
			for(int i=0,j=2;i<3;i++,j--)
				for(int k=0,l=2;k<3;k++,l--)
					z[i][k]=x[i][k]*y[j][l];
			System.out.println("Multiplication of given matrix");
				
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
					System.out.print(z[i][j]+" ");
				System.out.println();
			}
		}
	}

