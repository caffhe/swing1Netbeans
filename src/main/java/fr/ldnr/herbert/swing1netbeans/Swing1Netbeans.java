/*
 */

package fr.ldnr.herbert.swing1netbeans;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Herbert Caffarel
 */
public class Swing1Netbeans {

    public static void main(String[] args) {
        // Créer un cadre
        JFrame myWindow = new JFrame();
        // Créer un bouton
        JButton jb1 = new JButton("Click me!");
        // Ajouter le bouton dans le cadre (mauvaise pratique !)
        myWindow.add(jb1);

        // Dimensionner le cadre
        myWindow.setSize(200, 200);
        // Faire en sorte que fermer le cadre finisse l'application
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Afficher le cadre
        myWindow.setVisible(true);
    }
}
