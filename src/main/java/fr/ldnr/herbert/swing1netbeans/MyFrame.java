package fr.ldnr.herbert.swing1netbeans;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Herbert Caffarel
 */
public class MyFrame extends JFrame {

    private int width;
    private int height;

    public MyFrame() {
        this(200, 200);
    }

    public MyFrame(int width, int height) {
        this.width = width;
        this.height = height;
        this.setUpAndDisplay();
    }

    private void setUpAndDisplay() {
        JPanel content = new JPanel();
        JButton jb1 = new MyButton("Click me!", Color.RED);
        jb1.addActionListener((e) -> {
            System.out.println("Coucou");
        });
        content.add(jb1);
        this.setContentPane(content);

        this.setSize(this.width, this.height);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

}
