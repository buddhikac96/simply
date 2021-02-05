package ast.gui;

import java.awt.Graphics;
        import javax.swing.JFrame;
        import javax.swing.JPanel;

public class ASTVisualizer extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        // Draw Tree Here
        g.drawOval(5, 5, 25, 25);
        g.drawOval(10, 10, 30, 30);
        g.drawOval(15, 15, 35, 35);
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.add(new ASTVisualizer());
        jFrame.setSize(500, 500);
        jFrame.setVisible(true);
    }

}