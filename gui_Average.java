import javax.swing.JOptionPane;
public class gui_Average {

public static void main(String []args){
int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter A Number"));
int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter The Second Number")); 
int c =Integer.parseInt(JOptionPane.showInputDialog(null,"Enter The Third Number"));
float avg = (a+b+c)/3;
JOptionPane.showMessageDialog(null,"Average is : "+avg);


}



}
