package currencycalculator;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

	// url, contentId, elementClassF
	String[][] extractorInfos = { { "https://dovizborsa.com/doviz/dolar", "435-1", "-d3 _d3 _x19" },
			{ "https://dovizborsa.com/doviz/kanada-dolari", "154-1", "-d3 _d3 _x19" },
			{ "https://dovizborsa.com/doviz/ingiliz-sterlini", "150-1", "-d3 _d3 _x19" },
			{ "https://dovizborsa.com/doviz/euro", "200-1", "-d3 _d3 _x19" },
			{ "https://dovizborsa.com/doviz/isvicre-frangi", "159-1", "-d3 _d3 _x19" } };

	Extractor[] extractors = new Extractor[extractorInfos.length];

	String[][] elementInfos = {
			{ "USD", "C:\\Eclipse\\eclipse-workspace\\currencyCalculator0.3\\src\\flagPictures\\usFlag.png" },
			{ "CAD", "C:\\Eclipse\\eclipse-workspace\\currencyCalculator0.3\\src\\flagPictures\\caFlag.png" },
			{ "GBP", "C:\\Eclipse\\eclipse-workspace\\currencyCalculator0.3\\src\\flagPictures\\ukFlag.png" },
			{ "EUR", "C:\\Eclipse\\eclipse-workspace\\currencyCalculator0.3\\src\\flagPictures\\euFlag.png" },
			{ "CHF", "C:\\Eclipse\\eclipse-workspace\\currencyCalculator0.3\\src\\flagPictures\\swiFlag.png" } };

	FrameElement[] elements = new FrameElement[elementInfos.length];

	MainFrame(String title, Dimension frameDimension) {
		super(title);
		setLayout(new GridLayout(elementInfos.length, 1));
		setSize(frameDimension);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		for (int i = 0; i < extractors.length; i++) {
			extractors[i] = new Extractor(extractorInfos[i][0], extractorInfos[i][1], extractorInfos[i][2]);
		}

		for (int i = 0; i < elements.length; i++) {
			elements[i] = new FrameElement(frameDimension, elementInfos[i][0], elementInfos[i][1]);
			getContentPane().add(elements[i]);

		}

		setVisible(true);

	}

	public void run() {
		for (int i = 0; i < elements.length; i++) {
			// elements[i].updateElement(extractors[i].getVal());
			// System.out.printf("%d: %s\n", i,
			// String.valueOf(elements[i].inputField.getFocus()));
			elements[i].updateElement(extractors[i].getVal());

		}
	}

}
