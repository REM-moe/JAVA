import java.util.Scanner;
class Armstron
{
Scanner s = new Scanner(System.in);
{System.out.println("Enter Number : ");} // Try Running Without { } 
int num = s.nextInt();
class Arms
	{//Armstrong Checking
	void armstrong_check()
		{ int a =0;
		int temp = num;
		while(num != 0 )
			{
			int rem = num%10;
			a = a+(rem*rem*rem);
			num = num/10;
			}
		System.out.println(a);
		if (a == temp)
			System.out.println("Number "+temp+" is An Armstrong Number");
		else
			System.out.println("Number "+temp+" is Not An Armstrong Number");
		}
	}
}
class Armstrong
{
public static void main(String ar[])
	{
	Armstron Out = new Armstron();
	Armstron.Arms In = Out.new Armstrong();
	In.armstrong_check();
	}
}
