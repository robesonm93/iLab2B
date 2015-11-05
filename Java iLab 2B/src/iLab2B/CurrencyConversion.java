package iLab2B;

public class CurrencyConversion {
	
	private double ammountedEntered;
	private double ammountConverted;
	
	public double getAmmountedEntered() {
		return ammountedEntered;
	}
	public void setAmmountedEntered(double ammountedEntered) {
		this.ammountedEntered = ammountedEntered;
	}
	
	public double getAmmountedConverted() {
		return ammountConverted;
	}
	public void setAmmountedConverted(double ammountConverted) {
		this.ammountConverted = ammountConverted;
	}
	
	public double convert(String usersCurrency, double Ammount, String convertToCurrency){
		setAmmountedEntered(Ammount);
		switch(usersCurrency){
		case "YEN":
			switch(convertToCurrency){
			case "USD": setAmmountedConverted(this.getAmmountedEntered() * .0081) ;
				break;
			case "EURO":  setAmmountedConverted(this.getAmmountedEntered() * .0073);
				break;
			default:
				break;
			}
			break;
		case "EURO": 
			switch(convertToCurrency){
			case "USD":  setAmmountedConverted(this.getAmmountedEntered() * 1.11);
				break;
			case "YEN": setAmmountedConverted(this.getAmmountedEntered() * 136.08) ;
				break;
			default:
				break;
			}
			break;
		case "USD":
			switch(convertToCurrency){
			case "YEN": setAmmountedConverted(this.getAmmountedEntered() * 123.14);
				break;
			case "EURO":  setAmmountedConverted(this.getAmmountedEntered() * .90);
				break;
			default:
				break;
			}
		}
		return this.getAmmountedConverted();
	}
	
}
