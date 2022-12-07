import javax.swing.*;

public class DrawFrame extends JFrame {
    public DrawFrame() {
        setTitle("Swing Project");
        setExtendedState(MAXIMIZED_BOTH);
        //setSize(1000,1000);
        JComponent component = new DrawComponent();
        add(component);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
