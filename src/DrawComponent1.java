import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class DrawComponent1 extends JComponent {
    public void paint(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setFont(new Font("Times New Roman", Font.BOLD, 50));
        String groupNumber = "09-011 группа";
        graphics2D.drawString(groupNumber, (getWidth() - graphics2D.getFontMetrics().stringWidth(groupNumber))/ 2, 350);
        graphics2D.setFont(new Font("Times New Roman", Font.BOLD, 40));
        String aboutGroup = "09-011 - это лучшая академическая группа по версии авторов данного проекта!";
        graphics2D.drawString(aboutGroup, (getWidth() - graphics2D.getFontMetrics().stringWidth(aboutGroup))/ 2, 700);
        try {
            Image image1 = ImageIO.read(new File("/Users/Rasul/IdeaProjects/swing_project/group1.jpg"));
            Image image2 = ImageIO.read(new File("/Users/Rasul/IdeaProjects/swing_project/group2.jpg"));
            graphics2D.drawImage(image1, 180, 180, 500, 320, null);
            graphics2D.drawImage(image2, getWidth() - 180 - 500, 180, 500, 320, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void drawCenteredString(String s, int w, int h, Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        int x = (w - fm.stringWidth(s)) / 2;
        int y = (fm.getAscent() + (h - (fm.getAscent() + fm.getDescent())) / 2);
        g.drawString(s, x, y);
    }
}
