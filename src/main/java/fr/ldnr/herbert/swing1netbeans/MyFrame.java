package fr.ldnr.herbert.swing1netbeans;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Herbert Caffarel
 */
public class MyFrame extends JFrame {

    private int height;
    private int width;
    private MyButton button;
    private Color buttonColor;

    public MyFrame() {
        this("MyFrame", 200, 200, Color.yellow);
    }

    public MyFrame(String title) {
        this(title, 200, 200, Color.yellow);
    }

    public MyFrame(int width, int height) {
        this("MyFrame", width, height, Color.yellow);
    }

    public MyFrame(String title, int width, int height, Color buttonColor) {
        super(title);
        this.width = width;
        this.height = height;
        this.buttonColor = buttonColor;
        this.setUpAndDisplay();
    }

    private void setUpAndDisplay() {
        // Ajouter un gestionnaire de placement au cadre
        // On récupère la toile de fond et on y applique un layout manager
        // de type FlowLayout
        this.getContentPane().setLayout(new FlowLayout());
        // Créer un bouton
        button = new MyButton("Cliquez sur moi !", buttonColor);
        // Ajouter le bouton dans le cadre
        this.add(button);

        // Dimensionner le cadre
        this.setSize(this.width, this.height);
        // Faire en sorte que fermer le cadre finisse l'application
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Afficher le cadre
        this.setVisible(true);
    }

    public MyButton getButton() {
        return button;
    }

}
