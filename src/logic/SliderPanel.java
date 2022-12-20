package logic;

import javax.swing.*;
import java.awt.*;

public class SliderPanel extends JPanel {
    JSlider slider = new JSlider();
    public SliderPanel() {
        setBackground(new Color(201, 222, 201));
        //setLayout(new CardLayout(20, 10));
        //setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        slider.setBackground(new Color(201, 222, 201));
        slider.setMajorTickSpacing(25);
        slider.setMinorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        add(slider);
    }
}
