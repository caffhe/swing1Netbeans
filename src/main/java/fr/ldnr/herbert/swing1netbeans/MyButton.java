package fr.ldnr.herbert.swing1netbeans;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author Herbert Caffarel
 */
public class MyButton extends JButton {

    Color color;

    public MyButton() {
        this("My button", null);
    }

    public MyButton(String text) {
        this(text, null);
    }

    public MyButton(Color color) {
        this("My button", color);
    }

    public MyButton(String text, Color color) {
        this.color = color;
        this.setText(text);
        this.setUp();
    }

    private void setUp() {
        this.setBackground(this.color);
    }
}
