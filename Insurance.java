	//Author: Divine Iloh
	//BINS 5312
	//Date: 03/03/2022

package Insurance;
import javax.swing.JOptionPane;
public class Insurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//define variables
		int cYear = 0;
		int bYear = 0;
		double premium = 0;
		String result = "";
		
		//request for input from user and store in variables bYear and cYear
		result = JOptionPane.showInputDialog("Enter your year of birth");
		bYear = Integer.parseInt(result);
		
		result = JOptionPane.showInputDialog("Enter the current year");
		cYear = Integer.parseInt(result);
		
		
		//display insurance premium
		premium = computeInsurance(cYear, bYear);
		JOptionPane.showMessageDialog(null, "Your insurance premium is " + String.format("%,.2f", premium));
	}
	
	//creating a method that computes insurance premium with arguments; current year and birth year.
	public static double computeInsurance(int currentYear, int birthYear)
	{
		int age;
		double premium;
		age = currentYear - birthYear;
		premium = ((age/10) +15) * 20;
		return premium;
	}

}
