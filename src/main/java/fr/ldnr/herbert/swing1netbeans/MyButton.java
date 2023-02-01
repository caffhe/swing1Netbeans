package fr.ldnr.herbert.swing1netbeans;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author Herbert Caffarel
 */
public class MyButton extends JButton {

    private Color color;

    public MyButton() {
        this("Click Me!");
    }

    public MyButton(Color color) {
        this("Click Me!", color);
    }

    public MyButton(String text) {
        this(text, Color.red);
    }

    public MyButton(String text, Color color) {
        super(text);
        this.color = color;
        this.setUp();
    }

    private void setUp() {
        this.setBackground(color);
    }
}
