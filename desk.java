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
    static JButton button1,button2,button3,button4;
    static JPanel myPanel1, myPanel2, mainPanel,panelData;
    static JLabel label;

    public void desk(){
        frame = new JFrame("Чемпионат по футболу"); // ожидается что это будет родительское окно, в котором будут вкладки
        frame.setTitle("Чемпионат по футболу");

        myPanel1 = new JPanel();
        myPanel2 = new JPanel();
        mainPanel = new JPanel();
        panelData = new JPanel();
        label = new JLabel(" Информация о команде");
        myTable = new JTable(FirstWindow.means,FirstWindow.heads);
        jscrlpn = new JScrollPane(myTable);

        components_myPanel1();
        components_myPanel2();



        panelData.setLayout(new BorderLayout());
        panelData.add(label, BorderLayout.NORTH);

        panelData.add(myPanel2,BorderLayout.CENTER);



        mainPanel.add(myPanel1);
        mainPanel.add(panelData); 
        frame.getContentPane().add(mainPanel);


        frame.setSize(600,600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocation(300, 100);


        frame.setPreferredSize(new Dimension(250, 200));  // размеры окна прокруутки
        frame.setResizable(false);



        //frame.pack();  //  !!!! добавить
        frame.setVisible(true);

    }
    private void  components_myPanel1(){
        button1 = new JButton("Информация о команде");
        button2 = new JButton("Таблица");
        button3 = new JButton("Результаты");
        button4 = new JButton("Сохранить в файл");
        myPanel1.setLayout(new FlowLayout());
        myPanel1.add(button1);
        myPanel1.add(button2);
        myPanel1.add(button3);
        myPanel1.add(button4);
    }

    private void components_myPanel2(){

        myPanel2.add(jscrlpn);
        myPanel2.setLayout(new GridLayout(1,4));
    }
    @Override
    public void actionPerformed (ActionEvent e){}

}


//