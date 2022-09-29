import java.util.Scanner;
public class For_each
{
public static void main(String []args)
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Size Of Array");
	int size = s.nextInt();
	int array[] = new int[size];
	System.out.println("Enter Elements");
	for (int i=0;i<size;i++)
		{
		array[i] = s.nextInt();
	}
	System.out.println("Enter Element To Be Searched");
	int element = s.nextInt(); 
	int c = 1;
	for(int x:array)
	{
		if(element==x)
		{
			System.out.println("Element "+ x +" Found At "+ c);}
		else
			c++;

	}
	if(c>size)
	{System.out.println("Element "+element+" not Found!");}

}
	}
