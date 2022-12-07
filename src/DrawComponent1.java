import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class DrawComponent1 extends JComponent {
    public void paint(Graphics graphics) {
        // JLabel label = new JLabel ("Picture", new ImageIcon("/Users/Rasul/IdeaProjects/swing_project/photo1.jpg"), JLabel.CENTER);
        Graphics2D graphics2D = (Graphics2D) graphics;
        try {
            Image image1 = ImageIO.read(new File("/Users/Rasul/IdeaProjects/swing_project/photo1.jpg"));
            Image image2 = ImageIO.read(new File("/Users/Rasul/IdeaProjects/swing_project/photo2.jpg"));
            graphics2D.drawImage(image1, 210, 180, 400, 250, null);
            graphics2D.drawImage(image2, 1200, 180, 400, 250, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
