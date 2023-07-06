package currencycalculator;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class NumField extends JTextField {

	boolean dotAllow = true;
	boolean focused;

	public NumField(String name, Color bgColor) {
		super();
		setOpaque(true);
		setBackground(bgColor);
		setHorizontalAlignment(JTextField.CENTER);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.gray, 1), name,
				TitledBorder.CENTER, TitledBorder.CENTER));

		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {

				if (getText().equals("")) {
					dotAllow = false;

				} else {
					dotAllow = getDotNum(getText()) == 0;
				}

				if (dotAllow) {
					if (isNumber(e.getKeyCode()) || 8 == e.getKeyCode() || 46 == e.getKeyCode()) {
						setEditable(true);
					} else {
						setEditable(false);
					}
				} else {
					if (isNumber(e.getKeyCode()) || 8 == e.getKeyCode()) {
						setEditable(true);
					} else {
						setEditable(false);
					}
				}
				setBackground(bgColor);
			}
		});

		addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				focused = true;

			}

			@Override
			public void focusLost(FocusEvent e) {
				focused = false;

			}
		});

	}

	public boolean getFocus() {
		return focused;
	}

	private boolean isNumber(int keyCode) {
		return 48 <= keyCode && keyCode <= 57;
	}

	private int getDotNum(String s) {
		int i = 0;
		for (char c : s.toCharArray()) {
			if (c == '.') {
				i++;
			}
		}
		return i;
	}
}
