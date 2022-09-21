package youtubelectures;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
				
		ArrayList<CreditManager> credits = new ArrayList<CreditManager>();
		credits.add(new MortgageManager());
		credits.add(new VehicleManager());
		credits.add(new OfficerManager());
		
		for(CreditManager credit : credits) {
			credit.calculate();
		}
				
	}
	
}
















