/*
 */

package fr.ldnr.herbert.swing1netbeans;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Herbert Caffarel
 */
public class Swing1Netbeans {

    public static void main(String[] args) {
        // Créer un cadre
        JFrame myWindow = new JFrame();
        /* Ajouter un gestionnaire de placement au cadre (meilleure pratique)
          1/ On crée un Panel (qui par défaut contient un layout manager de
             type FlowLayout
          2/ On ajoute le Panel au cadre
         */
        JPanel jp = new JPanel();
        myWindow.add(jp); // On pourrait utiliser setContentPane
        // Créer un bouton
        JButton jb1 = new JButton("Click me!");
        // Ajouter le bouton dans le panel
        jp.add(jb1);

        // Surveiller le bouton pour répondre à un événement
        jb1.addActionListener((e) -> {
            System.out.println("Coucou");
        });

        // Dimensionner le cadre
        myWindow.setSize(200, 200);
        // Faire en sorte que fermer le cadre finisse l'application
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Afficher le cadre
        myWindow.setVisible(true);
    }
}
