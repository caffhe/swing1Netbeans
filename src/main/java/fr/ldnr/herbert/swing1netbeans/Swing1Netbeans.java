/*
 */

package fr.ldnr.herbert.swing1netbeans;

import java.awt.Color;

/**
 *
 * @author Herbert Caffarel
 */
public class Swing1Netbeans {

    public static void main(String[] args) {
        MyFrame mf = new MyFrame("Mon bouton", Color.ORANGE);
        mf.getButton().addActionListener((e) -> {
            System.out.println("Coucou");
        });
        MyFrame mf1 = new MyFrame("toto", "Un bouton", Color.blue);
        MyFrame mf2 = new MyFrame("Coucou");

    }
}
