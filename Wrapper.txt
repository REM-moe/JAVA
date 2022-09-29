public class Wrapper
{
public static void main (String[] ar)
	{
	/*Wrapper Classes = Provides a way to use primitive data types as reference data types
			    reference data types contain useful methods 
			    can be used with collections {ArrayList}
	Primitive 		Wrapper
	boolean 		Boolean
	char			Character
	int 			Integer
	double			Double
	
	autoboxing = automativ=c conversion that compiler makes between primitive datatypes and
	their corresponding wrapper classes
	 	Syntax:
	 		Wrapper (eg:Boolean) var_name = value;
	unboxing =  the reverse of autoboxing Convert a Wrapper class to primitive values*/
	
	Boolean v = true;
	Character c ='$';
	Integer i = 69 ;
	Double d = 0.420 ;
	String e = "yesh"; /* yesh String is a wrapper ie- reference data type (String is a class)
			     Basically we convert primitive datatype to Wrapper class to use built in methods 
			     of java 
			     eg:
			     		Integer.SIZE();
			     		Character.toLowerCase();
			     	we can conver primitive data type to wrapper and use their methods ;)
			     	
			     	
	unboxing
		it is the way in which java allows us to use wrapper classes as primite datatypes 
		ie 	 */
	int num =3;
	num = (num == 3) ? i++ : i-- ;
	System.out.println(i);
	System.out.println(num); /* here we treated i as a primitive data type 
				    But accesing the wrapper has a lot of steps compared to primitive data types
				    primitive values are a lot faster than reference data types */
	}

}
