import javax.swing.JOptionPane;
/** this code convert cups to fluid ounces.*/
public class CupConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cups,ounces;
		cups = getCups();
		ounces = cupToOunces(cups);
		display(cups,ounces);
		System.exit(0);

	}
	public static double getCups()
	{
		String input;
		double numCup;
		input = JOptionPane.showInputDialog("Tis program convert measurments in cups\n" +
											"to the fluid ounces. For your refrence the\n "+
											"formula is: \n"+
											"1 cup =  8 ounces.\n\n"+
											"Enter the number of cups: ");
		numCup = Double.parseDouble(input);
		return numCup;
	}
	public static double cupToOunces(double cups)
	{
		return cups*8;
	}
	public static void display( double cups, double ounces) {
		JOptionPane.showMessageDialog(null, cups+ " cups equals "+ ounces+" ounces.");
		
	}
}
