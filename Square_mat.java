import java.util.Scanner;
class Sumt
{	Scanner S = new Scanner(System.in);
	void Readmat(int  a[][],int ro,int co)
		{
		for (int i=0;i<ro;i++)
		{
			for(int j=0;j<co;j++)
			{
			System.out.print("Enter Element ["+i+"x"+j+"] : ");
			a[i][j] = S.nextInt();
			}  
		}
		}
	void dismat(int a[][],int row,int col)
	{System.out.println("Matrix is :");
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<col;j++)
			{
			System.out.print(a[i][j]+"\t");
			}System.out.println(" ");
		}
	}
	// Transpose
	int transmat(int a[][],int row,int col,int trans[][])
	{
	for (int i =0;i<row;i++)
	{
		for (int j=0;j<col;j++)
		{
			trans[i][j] = a[j][i];
		}

	}
	System.out.println("Transpose Matrix is :");
	return 0;
	}
	// sum of Row Elements
	void rsum(int a[][],int ro,int co)
	{
	int rosum =0;
	for (int i=0;i<co;i++)
	{
	for (int j=0;j<ro;j++)
		{
			rosum = rosum + a[i][j];
		}
	System.out.println("Sum of "+(i+1)+"st row : "+rosum);
	rosum =0;
	}}
	// Sum of Column elements
	void cosum(int a[][],int ro,int co)
	{
	int cs=0;
	for(int j=0;j<co;j++)
	{
	for (int i=0;i<ro;i++)
	 {
		cs = cs + a[i][j];		
	 }
	System.out.println("Sum of "+(j+1)+"th column is : "+cs);
	 cs =0;
	}
	}

	// diagonal sum
	void drsum(int a[][],int  ro, int co) 
	{
	int i=0;
	int j=0;
	int dr=0;
	while( i<ro &&  j<co)
	{
		dr = dr+a[i][j];
		i++;
		j++;
	}
	System.out.println("diagonal [LEFT] Sum = "+dr);
	}
	// Diagonal Sum LEFT
	void dlsum(int a[][],int  ro, int co) 
	{
	int dl =0;
	for (int i =0;i<ro;i++)
	{
		for (int j1=0;co>j1;co--)
		{
			dl = dl+ a[i][--co];
		}
	}
	System.out.println("diagonal [RIGHT] Sum = "+dl);
	}
		
	
}
// Main Class
public class Square_mat
{
public static void main(String ar[])
{
Scanner s = new Scanner(System.in);
System.out.println("Enter Number Of Row And Column");
int row = s.nextInt();
int col =s.nextInt();
int array[][] = new int[row][col];
int trans[][] = new int[row][col];
Sumt sus = new Sumt();
sus.Readmat(array,row,col);
char cont ='y';
do{
System.out.println("Enter \n 0: for Exciting \n 1: for Displaying elements\n 2: For Displaying Transpose\n 3: For Sum Of all Row Elements\n"
		+ " 4: Sum Of Column Elements\n 5: Sum of Diagonal elemnts [L-R]\n 6: Sum Of Diagonal Elements [R-L]");
int op =s.nextInt();
	switch(op)
	{
		case 1:
			sus.dismat(array,row,col);
			break;
		case 2:
			sus.transmat(array,row,col,trans);
			sus.dismat(trans,row,col);
			break;
		case 0:
			System.out.println("Exiting...");
			System.exit(0);
			break;
		case 3:
			if(row == col)
			sus.rsum(array,row,col);
			else
				System.out.println("Opertaion only possilbe in Square Matrices");			
			break;
		case 4:
			if(row == col)
				sus.cosum(array,row,col);
			else
				System.out.println("Operation Only Possible in Square Matrix");
			break;
		case 5:	
			if(row == col)
				sus.drsum(array,row,col);
			else
				System.out.println("Operation only possible in Square MAtrices");
			break;
		case 6:
			if (row==col)
				sus.dlsum(array,row,col);
			else 
					System.out.println("Operation only possible in Square MAtrices");
			break;

	System.out.println("Do You Want To Continue  [y]");	
	cont =s.next().charAt(0);
}while(cont=='y')};
System.out.println("Exiting...");

}
}
