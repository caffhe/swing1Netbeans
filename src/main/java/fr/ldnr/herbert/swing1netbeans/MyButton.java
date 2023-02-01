package fr.ldnr.herbert.swing1netbeans;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author Herbert Caffarel
 */
public class MyButton extends JButton {

    private Color color;

    public MyButton(String text, Color color) {
        super(text);
        this.color = color;
        setUp();
    }

    private void setUp() {
        this.setBackground(color);
        // Pour les mac
        //this.setOpaque(true);
        //this.setBorderPainted(false);
    }


}
