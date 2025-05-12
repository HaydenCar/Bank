import java.awt.*;
import javax.swing.*;

public class Decorator extends JButton {
    public Decorator(JComponent c) {
        setLayout(new BorderLayout());
        add(c, BorderLayout.CENTER);
    }
}


