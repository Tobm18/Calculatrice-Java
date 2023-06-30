package Calculatrice;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;

 
public class RoundButton extends JButton {
    private static final long serialVersionUID = 9032198251140247116L;
    String text;
    public RoundButton(String s) {
        super(s);
        text = s;
        setBorderPainted(false);
        setContentAreaFilled(false);
        setFocusable(false);
    }
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        if (getModel().isPressed()) {
            g.setColor(new java.awt.Color(200,200,200,100));
            g2.fillRect(3, 3, getWidth() - 6, getHeight() - 6);
        }
        
        super.paintComponent(g);
        g2.setColor(new Color(50, 50, 50));
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setStroke(new BasicStroke(2.5f));
        g2.draw(new RoundRectangle2D.Double(1, 1, (getWidth() - 3),(getHeight() - 3), 15, 15));
        g2.dispose();
    }
}