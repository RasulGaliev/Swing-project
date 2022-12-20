package logic;

import components.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class DrawFrame extends JFrame implements ActionListener {

    JPanel mainPanel = new JPanel();
    JButton next = new JButton("След");
    JButton prev = new JButton("Пред");
    public void first() {

    }
    public DrawFrame() throws InterruptedException, IOException {
        setTitle("Swing Project");
        setExtendedState(MAXIMIZED_BOTH);
        mainPanel.setLayout(new CardLayout(10, 10));
        mainPanel.setBackground(Color.WHITE);

        JComponent firstComponent = new FirstComponent();
        Buttons we = new Buttons("Мы", 400);
        firstComponent.add(we);

        Components bossComponent = new Components();
        bossComponent.str = "/group/boss.jpg";
        Buttons ser = new Buttons("Староста", 650);
        bossComponent.add(ser);

        Components groupComponent = new Components();
        groupComponent.str = "/group/group.jpg";
        Buttons students = new Buttons("Группа", 700);
        groupComponent.add(students);

        Components collage = new Components();
        collage.str = "/group/collage.jpg";

        Components karina = new Components();
        karina.str = "/student/my.jpg";

        Components darya = new Components();
        darya.str = "/student/best.jpg";

        Components rasul = new Components();
        rasul.str = "/student/me.jpg";

        Components ilvar = new Components();
        ilvar.str = "/student/bro.jpg";

        Components michael = new Components();
        michael.str = "/student/cat.jpg";

        Components ayvaz = new Components();
        ayvaz.str = "/student/vaz.jpg";

        TestPanel testPanel = new TestPanel();
        Buttons button = new Buttons("Сдать", 500);
        testPanel.add(button);

        Components evaluation = new Components();
        evaluation.str = "/group/evaluation.jpg";
        Buttons eval = new Buttons("Оценить", 680);
        evaluation.add(eval);

        SliderPanel sliderPanel = new SliderPanel();
        Buttons ev = new Buttons("Оценить", 680);
        sliderPanel.add(ev);

        Components authors = new Components();
        authors.str = "/group/authors.jpg";

        mainPanel.add(firstComponent);
        mainPanel.add(collage);
        mainPanel.add(bossComponent);
        mainPanel.add(karina);
        mainPanel.add(groupComponent);
        mainPanel.add(darya);
        mainPanel.add(rasul);
        mainPanel.add(ilvar);
        mainPanel.add(ayvaz);
        mainPanel.add(michael);
        mainPanel.add(testPanel);
        mainPanel.add(evaluation);
        mainPanel.add(sliderPanel);
        mainPanel.add(authors);


        JPanel buttons = new JPanel();
        buttons.setBackground(Color.cyan);
        buttons.setLayout(new FlowLayout(FlowLayout.CENTER));

        buttons.add(prev);
        prev.addActionListener(this);
        buttons.add(next);
        next.addActionListener(this);
        we.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)mainPanel.getLayout()).next(mainPanel);
            }
        });
        ser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)mainPanel.getLayout()).next(mainPanel);
            }
        });
        students.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)mainPanel.getLayout()).next(mainPanel);
            }
        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)mainPanel.getLayout()).next(mainPanel);
            }
        });
        eval.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)mainPanel.getLayout()).next(mainPanel);
            }
        });
        ev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)mainPanel.getLayout()).next(mainPanel);
            }
        });
        getContentPane().add("Center", mainPanel);
        getContentPane().add("South", buttons);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next)
            ((CardLayout)mainPanel.getLayout()).next(mainPanel);
        if (e.getSource() == prev)
            ((CardLayout)mainPanel.getLayout()).previous(mainPanel);
    }
}
