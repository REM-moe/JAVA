import java.util.Scanner;
class MatrixOP
{
	int a[][] = new int[100][100];
	int b[][] = new int[100][100];
	Scanner Sc = new Scanner(System.in);
	//read matrix
	void readmat(int a[][],int ro,int co)
	{
	System.out.println("Enter Elements of "+ro+"x"+co +" matrix");
	for(int i=0;i<ro;i++)
	{

		for(int j=0;j<co;j++)
		{
			System.out.println("Enter element {"+i+"x"+j+"} : ");
			a[i][j] =Sc.nextInt();
		}
		System.out.println("");
	}
	}
	// Display matrix
	void dismat(int a[][],int ro,int co)
	{
	for(int i=0;i<ro;i++)
	{
		for(int j=0;j<co;j++)
		{
		System.out.print(a[i][j]+"\t");
		}
		System.out.println("");
	}
	}
}
//Main Class
class MatrixMult
{
	public static void main(String ar[])
	{
	int a[][] = new int[100][100];
	int b[][] = new int[100][100];
	int c[][] = new int[100][100];
	Scanner Sc = new Scanner(System.in);
	MatrixOP obj = new MatrixOP();
	System.out.println("Enter Number Of Rows and Columns Of First Matrix");

	int rows1= Sc.nextInt();
	int cols1= Sc.nextInt();

	System.out.println("Enter Number Of Rows and Columns Of Second Matrix");

	int rows2= Sc.nextInt();
	int cols2= Sc.nextInt();

	if (rows1==cols2)
		{ obj.readmat(a,rows1,cols1); // reads A mat
	obj.readmat(b,rows2,cols2);
	System.out.println("First Matrix");
	obj.dismat(a,rows1,cols1);
	System.out.println("Second Matrix");
	obj.dismat(b,rows2,cols2);

	do
	{ 
			System.out.println("Enter \n0: For Exiting\n2 : For Multiplication result");

			int option = Sc.nextInt();
		switch(option)
	{
			case 0:
			System.exit(0);
			break;


			case 2: //Multiplication
				for(int i=0;i<rows1;i++)
				{
					for (int j=0;j<cols2;j++)
					{
						for (int k=0;k<rows2;k++)
							{
								c[i][j] = c[i][j] + (a[j][k]*b[k][j]);
							}
					}
				}	
				System.out.println("");
				obj.dismat(c,rows1,cols2);

	}
	}
	while(true);
}
else{System.out.println("Multiplication not Possible\n");}
}
}
