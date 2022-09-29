import java.util.Scanner;
public class Java_array{
	public static void main( String []args)
  {
	
	Scanner s = new Scanner(System.in);
	int array[][] = new int[100][100];
	int array1[][] = new int[100][100];
	System.out.println("Enter the size of array : -");
	int size = s.nextInt();
	System.out.println("Enter Size Of Row:-");
	int row = s.nextInt();
	System.out.println("Enter Size Of Coloumn:-");
	int col = s.nextInt();
	System.out.println("Enter elements :- ");
	int option = 0;
	option = s.nextInt();
	
	// option = 0 -- get elemnts and store
	if (option ==0)
	{	
		for (int i =0;i<row;i++)
		{
			for(int j=0 ; j<col;j++)
			{
				System.out.print("["+i+"|"+j+"]\t");  		
				array[i][j]=s.nextInt(); 
			}
				System.out.print("\n");
		}
	}
	
	System.out.print("\n");
	
	// PRINTING option == 1
	else if (option == 1)
	{
	System.out.println("All Elments are ");
	for (int i =0;i<row;i++)
	{
		for(int j=0 ; j<col;j++)
		{
		System.out.print("\t"+array[i][j]); 
		}
		System.out.println("\n");
		}
		
		
	}
	
	// TRANSPOSE AND PRINT
	else if (option == 3)
	{
		int tarray [][] = new int[100][100];
	
		for (int i=0;i<row;i++)
		{
			for (int j =0;j<col;j++)
			{
			tarray[j][i]=array[i][j];
			}
		}
		//transpose
		System.out.println("Transpose Of Matrix  Is ");
		for (int i =0;i<row;i++)
		{
			for(int j=0 ;j<col;j++)
			{
			System.out.print("\t"+tarray[i][j]); 
			}
			System.out.println("\n");
	}
	
	
		}	
	// SUM OF TWO MATRICES
	
	
}	
}	
	
	
	
	
	
