package components;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Components extends JComponent {
    public String str;
    public void paint(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        BufferedImage up;
        try {
            up = ImageIO.read(getClass().getResourceAsStream(str));
            graphics2D.drawImage(up, 0, 0, 1920, 1080, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
