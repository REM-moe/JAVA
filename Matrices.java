import java.util.Scanner;
public class Matrices{
	public static void main( String []args)
  {
	
	Scanner s = new Scanner(System.in);
	int array[][] = new int[100][100]; // name_1;
	int array1[][] = new int[100][100];
	int sum[][] = new int[100][100];
	int diff1[][] = new int[100][100];
	int diff2[][] = new int[100][100];
	int array2[][] = new int [100][100];
	int mult[][] = new int[100][100];
	int tarray [][] = new int[100][100];
	System.out.println("Enter Size Of Row:-");
	int row = s.nextInt();
	System.out.println("Enter Size Of Coloumn:-");
	int col = s.nextInt();
	System.out.println("Enter elements :- ");
	int option = 0;
	
	

	// READING ELEMENTS
	for (int i =0;i<row;i++)
		{
			for(int j=0 ; j<col;j++)
			{
				System.out.print("["+i+"|"+j+"]\t");  		
				array[i][j]=s.nextInt(); 
			}
				System.out.print("\n");
		}
	System.out.println("Name this Matrix");
	String Name_1 = s.nextLine(); // array[][]
	// MENU	
	while(true) // MENU DRIVEN
	{
		System.out.println("ENTER \n 1 : FOR PRINTING ARRAY \n 2 : FOR TARNSOPSE AND PRINT\n 3 : SUM OF N MATRICES (RISKY) \n 4 : FOR MULTIPLYING TO ANOTHER MATRIX \n 0 : FOR EXITING\n 5 : FOR MULTIPLICATION RESULT \n 6 : FOR MULTIPLICATION RESULT OF NEW MATRICES ");
		option = s.nextInt();
		
		switch (option)
		{
		case 1:	 // print array	
			System.out.println("All Elments are ");
			for (int i =0;i<row;i++)
			{
				for(int j=0 ; j<col;j++)
				{
				System.out.print("\t"+array[i][j]); 
				}
				System.out.println("\n");
				}
			break;
		case 2 : // transpose		
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
			break;
		case 0: //exit
			System.out.println("EXITING......");
			System.exit(0);
		case 3: //sum of 2 array
			//System.out.println("Enter the new Array Size");
			//int nsize = size;//s.nextInt();
			//System.out.println("Enter Size Of Row");
			int nrow = row;//s.nextInt();
			//System.out.println("Enter Size Of Column");
			int ncol = col;//s.nextInt();
			System.out.println("Enter Elements Of MATRIX To Be Summed With");
			
				for (int nr=0;nr<nrow;nr++)
					{
						for(int nc =0;nc<ncol;nc++)
						{
						System.out.print("["+nr+"|"+nr+"]\t"); 
						array1[nr][nc] = s.nextInt();
						}System.out.print("\n");
					} 
			System.out.println("Name this summed matrix something");
			String Name_sum = s.nextLine();
			System.out.print("SUMMING FIRST MATRIX WITH NEW MATRIX.....\n");
			if (Name_sum !=" ")
				{
				for (int i =0;i<nrow;i++)
					{
						for (int j =0;j<ncol;j++)
						{
							sum[i][j] = array[i][j] + array1[i][j];
						}
					}
				System.out.println("FINISHED ADDING... Enter 7 to print RESULTANT MATRIX again \n result:- \n ");
				}
			else
				{
				System.out.println("Name this summed matrix something");
				//String Name_sum = s.nextLine();
				continue;
				}
				break;
				
			
		case 7: // print sum array
				System.out.println("RESULT OF NEW MATRIX");
			for (int nr=0;nr<row;nr++)
					{
						for(int nc =0;nc<col;nc++)
						{
						System.out.print("\t"+ sum[nr][nc]); 
						}System.out.print("\n");
					} break;
		
		}
        }
	
  }}
