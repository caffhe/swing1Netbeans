/*
 */

package fr.ldnr.herbert.swing1netbeans;

import java.awt.FlowLayout;
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
        // Ajouter un gestionnaire de placement au cadre
        // On récupère la toile de fond et on y applique un layout manager
        // de type FlowLayout
        myWindow.getContentPane().setLayout(new FlowLayout());
        // Créer un bouton
        JButton jb1 = new JButton("Click me!");
        // Ajouter le bouton dans le cadre
        myWindow.add(jb1);

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
