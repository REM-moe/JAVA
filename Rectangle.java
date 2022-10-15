import java.util.Scanner;
public class Rectangle
{
float length;
float breadth;
float read(float l,float b)
	{
	length = l;
	breadth = b;
	}
double area()
	{
	double area = length * breadth;
	return area;
	}
}
public class UseRec{
	public static void main(String ar[])
	{
		Scanner s = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		System.out.println("Enter Length of First Rectangle");
		float len = s.nextFloat();
		System.out.println("Enter Breadth of Second Rectangle");
		float bre = s.nextFloat();
		rec.read(len,bre);
	}}
