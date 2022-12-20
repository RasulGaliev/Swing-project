package logic;

import javax.swing.*;
import java.awt.*;

public class Buttons extends JButton {
    public Buttons(String str, int y) {
        setText(str);
        setFont(new Font("Times New Roman",Font.BOLD, 18));
        setBackground(new Color(15, 152, 119));
        setForeground(Color.white);
        setBounds((1920 / 2) - (120 / 2), y,120,40);
    }

}
