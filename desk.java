package Football_GIT1;

/**
 * Created by KaZimad on 06.01.14.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class Desk extends JFrame implements ActionListener {

    static JTable myTable;
    static JFrame frame;
    static JScrollPane jscrlpn;
    static JLabel label;

    public void desk(){
        frame = new JFrame("Чемпионат по футболу"); // ожидается что это будет родительское окно, в котором будут вкладки
        frame.setTitle("Чемпионат по футболу");
        frame.getContentPane().setLayout(new FlowLayout());
        frame.setSize(300,170);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myTable = new JTable(FirstWindow.means,FirstWindow.heads);
        jscrlpn = new JScrollPane(myTable);
        myTable.setPreferredScrollableViewportSize(new Dimension(250,150));  // размеры окна прокруутки
        frame.getContentPane().add(jscrlpn);

        frame.pack();  //  !!!! добавить
        frame.setLocation(300, 300);
        frame.setVisible(true);

}

    @Override
    public void actionPerformed (ActionEvent e){}

}


