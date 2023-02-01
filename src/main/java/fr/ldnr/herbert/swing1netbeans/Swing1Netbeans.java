/*
 */

package fr.ldnr.herbert.swing1netbeans;

import java.awt.Color;
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
        //MyFrame myFrame = new MyFrame();
        //MyFrame mf1 = new MyFrame("Ma fenêtre");
        //MyFrame mf2 = new MyFrame(500, 800);
        MyFrame mf3 = new MyFrame("Ma vraie fenêtre", 600, 600, Color.green);

        mf3.getButton().addActionListener((e) -> {
            System.out.println("Coucou");
        });

    }
}
