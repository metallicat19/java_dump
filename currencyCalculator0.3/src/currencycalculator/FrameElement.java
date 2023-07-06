package currencycalculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameElement extends JPanel {

	private JLabel imageLabel;
	private StretchIcon stretchIcon;

	private JLabel nameLabel;
	private JLabel valueLabel;
	public NumField inputField;
	public NumField tlField;

	public FrameElement(Dimension dimension, String name, String destination) {

		super();
		setLayout(new GridLayout(1, 5, 10, 0));
		setBorder(BorderFactory.createLineBorder(Color.gray, 3));

		imageLabel = new JLabel();
		stretchIcon = new StretchIcon(destination);
		imageLabel.setIcon(stretchIcon);

		nameLabel = new JLabel(name);
		nameLabel.setHorizontalAlignment(JLabel.CENTER);

		valueLabel = new JLabel("");
		valueLabel.setHorizontalAlignment(JLabel.CENTER);

		inputField = new NumField(name, getBackground());
		inputField.setHorizontalAlignment(JTextField.CENTER);

		tlField = new NumField("TL", getBackground());
		tlField.setHorizontalAlignment(JLabel.CENTER);

		add(imageLabel);
		add(nameLabel);
		add(valueLabel);
		add(inputField);
		add(tlField);

	}

	public void updateElement(double d) {

		valueLabel.setText(String.format("%.4f", d));

		if (inputField.getFocus()) {

			set(inputField, tlField, d, true);

		} else if (tlField.getFocus()) {

			set(tlField, inputField, d, false);

		}

		return;

	}

	private void set(NumField inputField, NumField outputField, double val, boolean operation) {
		// operation: true -> multiplication
		// operation: false -> division

		if (operation) {

			if (inputField.getText() != null && !inputField.getText().equals("")) {
				outputField.setText(
						(String.format("%.4f", (Double.valueOf(inputField.getText()) * val))).replace(',', '.'));
			}

			else {
				outputField.setText("");
			}
		} else {

			if (inputField.getText() != null && !inputField.getText().equals("")) {
				outputField.setText(
						(String.format("%.4f", (Double.valueOf(inputField.getText()) / val))).replace(',', '.'));
			}

			else {
				outputField.setText("");
			}

		}

	}

}
