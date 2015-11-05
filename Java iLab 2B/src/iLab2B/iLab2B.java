package iLab2B;
import javax.swing.JOptionPane;

public class iLab2B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrencyConversion money = new CurrencyConversion();
		String userCurrency = "";
		String convertCurrency = "";
		String[] currencies = new String[] {"USD", "YEN", "EURO"};
		
		
		JOptionPane.showMessageDialog(null, money.convert(
				userCurrency = (String) JOptionPane.showInputDialog(null, "Please chose your currency", "Your currency",
		        JOptionPane.QUESTION_MESSAGE, null, currencies, currencies[1]),
		        Double.parseDouble(JOptionPane.showInputDialog("Please enter your ammount:")),
		        convertCurrency = (String)JOptionPane.showInputDialog(null, "Please the currency you wish to convert to", "Convert to currency",
				        JOptionPane.QUESTION_MESSAGE, null, currencies, currencies[1])));
	}	
}
