package fr.ldnr.herbert.swing1netbeans;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author Herbert Caffarel
 */
public class MyFrame extends JFrame {

    private String buttonText;
    private Color buttonColor;
    private MyButton button;

    public MyFrame(String buttonText) {
        this("My frame", buttonText, null);
    }

    public MyFrame(String buttonText, Color buttonColor) {
        this("My frame", buttonText, buttonColor);
    }

    public MyFrame(String title, String buttonText, Color buttonColor) {
        super(title);
        this.buttonText = buttonText;
        this.buttonColor = buttonColor;
        this.setUpAndDisplay();
    }

    private void setUpAndDisplay() {
        // Créer un cadre
        this.getContentPane().setLayout(new FlowLayout());
        // Créer un bouton
        button = new MyButton(this.buttonText, this.buttonColor);
        // Ajouter le bouton dans le cadre (mauvaise pratique !)
        this.add(button);

        // Dimensionner le cadre
        this.setSize(200, 200);
        // Faire en sorte que fermer le cadre finisse l'application
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Afficher le cadre
        this.setVisible(true);
    }

    public MyButton getButton() {
        return button;
    }

}
