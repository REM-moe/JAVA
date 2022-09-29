*****************************INTRODUCTION TO JAVA PROGRAMMING**********************************

package k;
// mian is the class i made you can make any class nam you want for eg ; public class monke(..)
public class mian {

	public static void main(String[] args) { 
		System.out.println("The world is cruel !!"); //ln- adds text in an individual line
		System.out.print("but you love, make it better !!"); // printing a line
		System.out.print("yeah you !!\n"); // Comment using \\ escape sequence using /"symbol"
		System.out.     println("\t you make the world better !! \" \n"); 
		/*
		 * 
		 * yeah multi  line commenting 
		 * tip sysout + ctr "space" = System.out.println
		 * replace text = edit> find replace
		 */
	}

}


**************************************DATA TYPES***********************************************
package k;

public class mian {

	public static void main(String[] args) { 
		int one ; // declaration
		one = 13; // assignment
		int on1e = 13; // initialization 
		System.out.println("my number is = "+one);
		long monke = 12345678977654345L; // L- practice 
		byte hi = 120; // max 127
		float pi = 3.14f ; // f -convention practice
		double y = 1.1234567890;
		boolean man = true ; // true of false
		char name_of_monke = '@';
		System.out.println(name_of_monke);
		String string = "abhay";
		System.out.println("Hello "+ string);
		
	}

}

***********************************SWAPPING TWO STRINGS****************************************

package k;

public class mian {

	public static void main(String[] args) { 
		//swapping two variables 
		String x = "ahoy";
		String y = "sailor";
		String temp = "" ;
		System.out.println("before swapping ");
		System.out.println("x:"+ x +" y:" + y);
		temp = x;
		x = y;
		y= temp;
		System.out.println("After swapping");
		System.out.println("x:"+ x  +" y:" + y);		
	}

}

*******************************************USER INPUT******************************************

package k;
import java.util.Scanner;
public class mian {

	public static void main(String[] args) { 
		// User Input
		Scanner SC = new Scanner(System.in);
		System.out.println("What is your name :");
		String Name = SC.nextLine();
		System.out.println("Hello " + Name);
		System.out.println("How old are you,"+Name+": " );
		int Age = SC.nextInt();
		System.out.println(Name + " is "+Age+" years old");
		SC.nextLine(); // clearing the /n from 18/n 
		System.out.println("What is your Favourite game :");
		String game = SC.nextLine();
		System.out.println(Name + " is "+Age+" years old loves to play "+ game  );
		
		
		/* using a nextLine() after this causes a problem  
		 * the program skips the nextLine prompt 
		 * solution is clear the next line() which will have a /n from the age input 
		 * ie. when 18 is entered it contains 18/n but nextInt() only takes 18 leaves /n
		 * and then the this nextLine() is encountered the prg skips this line to avoid we just call scanner again*/
		
	}
}

***************************OPERATORS AND OPERANDS**********************************************
package k;
import java.util.Scanner;
public class mian {

	public static void main(String[] args) { 
		// operands & operators
		double pizza = 22 ;
		System.out.println(pizza);
		
		pizza = pizza + 6;
		System.out.println(pizza);
				
		pizza = (double)pizza/99; // (cast)
		System.out.println(pizza);
		
		pizza = pizza%10;
		System.out.println(pizza);
		
		pizza++;
		System.out.println(pizza);		
	}
}
*******************************************SIMPLE GUI******************************************
package k;
import javax.swing.JOptionPane;
public class mian {

	public static void main(String[] args) { 
		// Basic GUI (graphical user interface)
		String name = JOptionPane.showInputDialog("Enter yor name : ");
		JOptionPane.showMessageDialog(null,"hello "+ name);
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age :"));
		JOptionPane.showMessageDialog(null,"you are "+ age+ " years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("enter your height "));
		JOptionPane.showMessageDialog(null, "your height is "+ height);
		
		
	}
}
*************************************AREA OF CIRCLE GUI****************************************
package k;
import javax.swing.JOptionPane;
public class mian {

	public static void main(String[] args) { 
		float radius = Float.parseFloat(JOptionPane.showInputDialog("Enter Radius of The Circle: "));
		double area = radius*radius*3.14;
		JOptionPane.showMessageDialog(null,"Area of circle of Radius "+radius+" is "+area);		
	}
}
*************************************MATH CLASS************************************************
package k;
import javax.swing.JOptionPane;
public class mian {
// Hypotenuse of a triangle
	public static void main(String[] args) { 
		float base = Float.parseFloat(JOptionPane.showInputDialog("ENTER THE LENGTH OF SIDE 1: "));
		float alti = Float.parseFloat(JOptionPane.showInputDialog("Enter LENGTH OF SIDE 2 : "));
		double Hypo = Math.round(Math.sqrt((base*base) + (alti*alti))) ;
		JOptionPane.showMessageDialog(null,"Hypotnuse lendth is "+Hypo);	
	}
}
*************************************RANDOM****************************************************
package k;
import java.util.Random;
import java.util.Scanner;
public class mian {
// Random Numbers 
	public static void main(String[] args) { 
		Random RAND = new Random();
		Scanner Scan =new  Scanner(System.in);
		System.out.println("Enter a Number to generate Random numbers between: ");
		int x = Scan.nextInt();
		Scan.close();
		int one = RAND.nextInt(x);
		System.out.println(one);
	}
}
************************************DICE SIMULATOR*********************************************
package k;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class mian {
// Rolling Dice
	public static void main(String[]args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("Program TO Simulate Any Sided Dice");
		System.out.println("Enter The Side Of The Dice ");
		int side = SC.nextInt()	;
		System.out.println("Enter Number Of Dices");
		int die = SC.nextInt();
		JOptionPane.showMessageDialog(null, "Chosen "+die+" die of sides= "+ side );
		SC.close();
		Random Ran = new Random();
		System.out.println("You have Choose a "+side + " Sided Dice");		
		for (int i = 0 ;i<die;i++) {
			int res = Ran.nextInt(side)+1; // +1 to avoid 0
		JOptionPane.showMessageDialog(null, "DICE SHOWS Results"+res);}
				
	}
}
*****************************CONTROL FLOW STATEMENTS*******************************************
package k;
import java.util.Scanner;
public class mian {
// IF ELSE
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = scan.nextLine();
		System.out.println("Enter your age");
		int age = Integer.parseInt(scan.nextLine());
		if (age< 18) {System.out.println("You are Not An Adult");}
		else if (age>= 60) {System.out.println("OK BOOMER!");}
		else {System.out.println("you are an Adult");}
	}
}
***********************************SWITCH STATEMENT********************************************
package k;
import javax.swing.JOptionPane;
