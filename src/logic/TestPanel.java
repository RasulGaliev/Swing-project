package logic;


import javax.swing.*;
import java.awt.*;
import java.awt.font.TextLayout;

public class TestPanel extends JPanel {
    public TestPanel() {
        setBackground(new Color(201, 222, 201));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel firstQuestion = new JLabel("Сколько человек учится в группе 09-011");
        add(firstQuestion);

        JRadioButton radioButton1 = new JRadioButton("20");
        JRadioButton radioButton2 = new JRadioButton("27");
        JRadioButton radioButton3 = new JRadioButton("22");
        JRadioButton radioButton4 = new JRadioButton("25");

        radioButton1.setBackground(new Color(201, 222, 201));
        radioButton2.setBackground(new Color(201, 222, 201));
        radioButton3.setBackground(new Color(201, 222, 201));
        radioButton4.setBackground(new Color(201, 222, 201));

        ButtonGroup buttonGroup = new ButtonGroup();

        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);

        add(radioButton1);
        add(radioButton2);
        add(radioButton3);
        add(radioButton4);

        JLabel secondQuestion = new JLabel("\nСтароста группы");
        add(secondQuestion);

        JRadioButton radioButton2_1 = new JRadioButton("Карина Ленаровна");
        JRadioButton radioButton2_2 = new JRadioButton("не Карина Ленаровна");

        ButtonGroup buttonGroup2 = new ButtonGroup();

        buttonGroup2.add(radioButton2_1);
        buttonGroup2.add(radioButton2_2);

        radioButton2_1.setBackground(new Color(201, 222, 201));
        radioButton2_2.setBackground(new Color(201, 222, 201));

        add(radioButton2_1);
        add(radioButton2_2);

        JLabel thirdQuestion = new JLabel("Выберите верные утверждения");
        add(thirdQuestion);

        JCheckBox jCheckBox1 = new JCheckBox("1) 09-011 самая лучшая группа");
        JCheckBox jCheckBox2 = new JCheckBox("2) в 09-011 самые умные люди");
        JCheckBox jCheckBox3 = new JCheckBox("3) В 09-011 самые красивые люди");

        jCheckBox1.setBackground(new Color(201, 222, 201));
        jCheckBox2.setBackground(new Color(201, 222, 201));
        jCheckBox3.setBackground(new Color(201, 222, 201));

        add(jCheckBox1);
        add(jCheckBox2);
        add(jCheckBox3);
    }


}
