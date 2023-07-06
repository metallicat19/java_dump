package currencycalculator;

import java.awt.Dimension;

public class CurrencyCalculator0_3 {

	public static void main(String[] args) {
		try {
			Dimension d = new Dimension(600, 400);
			MainFrame f = new MainFrame("Currency Calculator0.3", d);

			while (true) {
				f.run();
				Thread.sleep(250);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

//TODO remove panels (if unnecessary) and make more compact ways to achieve the program's goals
//******TODO make calculations work only when inputs are changed******