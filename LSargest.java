import java.util.Scanner;
public class LSargest
{
public static void main(String []ar)
	{
	Scanner Scan = new Scanner(System.in);
	System.out.println("Enter Size Of Array");
	int size = Scan.nextInt();
	int array[] = new int[size];
	int Second_large =0;
	//input array
	for (int i = 0; i<size;i++)
	{array[i]=Scan.nextInt();}
	int largest =array[0];
	for (int i =0;i<size;i++)
	{
		if (array[i]>largest)
			{largest = array[i];}
	}
	for (int i =0;i<size;i++)
	{	
		if(array[i]>Second_large && array[i]<largest)
		{Second_large = array[i];}
	}
	System.out.println("Largest = "+largest);
	System.out.println("Second Largest= "+ Second_large);
	}
}


