import java.util.Scanner;                
class Rectangle
{
float length;
float breadth;
float read(float l,float b)
        {
        length = l;
        breadth = b;
        return 0;
        }
float area(float length , float breadth)
        {
        float area = length * breadth;
        return area;
        }}
class UseRec{
        public static void main(String ar[])
        {
                Scanner s = new Scanner(System.in);
                Rectangle rec = new Rectangle();
                System.out.println("Enter Length of First Rectangle");
                float len = s.nextFloat();     
                System.out.println("Enter Breadth of First Rectangle");
                float bre = s.nextFloat();
                rec.read(len,bre);
                float areas = rec.area(len,bre);
                System.out.println("Area Of First Rectangle = "+areas+ "Units");
                Rectangle rec1 = new Rectangle();
		System.out.println("Enter Length of Second Rectangle");
		float lenq = s.nextFloat();  
                System.out.println("Enter Breadth of Second Rectangle");
                float breq = s.nextFloat();
                rec.read(lenq,breq);
                float areasq = rec.area(lenq,breq);
                System.out.println("Area Of Second Rectangle = "+areasq+ "Units");
                   
                
     }}

