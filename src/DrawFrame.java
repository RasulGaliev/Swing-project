import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawFrame extends JFrame implements ActionListener {
    Container c = getContentPane();

    // JComponent component = new DrawComponent();
    // add(component);
    JPanel mainPanel = new JPanel();
    //Создаем 5 кнопок управления с нужными надписями
    JButton first = new JButton("First");
    JButton last = new JButton("Last");
    JButton next = new JButton("Next");
    JButton prev = new JButton("Prev");
    public DrawFrame() {
        setTitle("Swing Project");
        setExtendedState(MAXIMIZED_BOTH);
        /*Режим размещения CardLayout предназначен для поочередного размещения
        нескольких компонент в одном контейнере (например, класса Panel).*/
        mainPanel.setLayout(new CardLayout(10, 10)); // РАСПОЛОЖЕНИЕ
        mainPanel.setBackground(Color.WHITE); // цвет
        DrawComponent1 drawComponent1 = new DrawComponent1();
        mainPanel.add(drawComponent1);

        JLabel label1 = new JLabel (new ImageIcon("/Users/Rasul/IdeaProjects/swing_project/photo1.jpg"), JLabel.CENTER);
        mainPanel.add(label1);
        JLabel label2 = new JLabel (new ImageIcon("/Users/Rasul/IdeaProjects/swing_project/photo2.jpg"), JLabel.CENTER);
        mainPanel.add(label2);
        JLabel label3 = new JLabel (new ImageIcon("/Users/Rasul/IdeaProjects/swing_project/photo3.jpg"), JLabel.CENTER);
        mainPanel.add(label3);
        JLabel label4 = new JLabel (new ImageIcon("/Users/Rasul/IdeaProjects/swing_project/photo4.jpg"), JLabel.CENTER);
        mainPanel.add(label4);
        JLabel label5 = new JLabel (new ImageIcon("/Users/Rasul/IdeaProjects/swing_project/photo5.jpg"), JLabel.CENTER);
        mainPanel.add(label5);

        JPanel buttons = new JPanel();
        buttons.setBackground(Color.cyan);
        buttons.setLayout(new FlowLayout(FlowLayout.CENTER));

        buttons.add(first);
        first.addActionListener(this);

        buttons.add(last);
        last.addActionListener(this);

        buttons.add(next);
        next.addActionListener(this);

        buttons.add(prev);
        prev.addActionListener(this);

        //панель с метками устанавливаем в центр фрейма
        getContentPane().add("Center", mainPanel);
        //панель с кнопками устанавливаем внизу
        getContentPane().add("South", buttons);
        //setBounds(100, 100, 400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == first)
            ((CardLayout)mainPanel.getLayout()).first(mainPanel);
        if (e.getSource() == last)
            ((CardLayout)mainPanel.getLayout()).last(mainPanel);
        if (e.getSource() == next)
            ((CardLayout)mainPanel.getLayout()).next(mainPanel);
        if (e.getSource() == prev)
            ((CardLayout)mainPanel.getLayout()).previous(mainPanel);

    }
}
