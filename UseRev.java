import java.util.Scanner;  
class Reverse
{                                         
	int reverse(int num)                 
        {                                                                                
                // reverse of number :)                                                    
                int rev = 0;                                                             
                while(num!=0)                            
                        {                                
                        int rem = num%10;                  
                        rev = rev*10 + rem;                                              
                        num = num/10;                                                    
                        }                                                             
			return rev;	}
String reverse(String word)
	{
	// Reverse Of String :)
	String rev_str = "";
		for (int i = word.length()-1 ;i>=0;i--)
		{
			rev_str = rev_str + word.charAt(i);
		}
	return rev_str;

	}
}   

class UseRev                                               
{                                                          
public static void main(String ar[])                       
{	
	Scanner S = new Scanner(System.in);
        Reverse r = new Reverse();
	System.out.println("Enter Digit to Print Reverse Of : ");
	int N = S.nextInt();
	S.nextLine(); // TRY RUNNING WITHOUT THIS TO SEE SOMETHING & REASON BEHIND THIS LINE(കോപ്പി അടിക്കരുത്)
	System.out.println("Enter String To Print Reverse Of :");
	String s = S.nextLine();
	System.out.println("Reverse of "+s+" is " +r.reverse(s));
	System.out.println("Reversem of "+N+" is "+ r.reverse(N));
}}

