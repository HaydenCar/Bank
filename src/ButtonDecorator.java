import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class ButtonDecorator extends Decorator {
    boolean over;

    Color normalColour = Color.WHITE;
    Color hoverColour = Color.GRAY;
    public ButtonDecorator(JButton c) {
        super(c);
        over = false;
        setBorder(new LineBorder(Color.GRAY, 1));
        setOpaque(true);
        setBackground(normalColour);
        c.setBorder(new LineBorder(Color.GRAY, 1));

        c.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                over = true;
                setHoverEffects(true);
                repaint();
            }

            public void mouseExited(MouseEvent e) {
                over = false;
                setHoverEffects(false);
                repaint();
            }
        });
    }

    private void setHoverEffects(boolean hover) {
        if (hover) {
            setBorder(new LineBorder(Color.BLACK, 2));
            setBackground(hoverColour);
        } else {
            setBorder(new LineBorder(Color.GRAY, 1));
            setBackground(normalColour);
        }
    }
}