package GUI.ramka;

import GUI.panele.Panel;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ramka extends JFrame implements ActionListener {

    private JPanel panel;
    private JMenuBar menu;
    private JMenu file;
    private JMenuItem save, load;


    public Ramka(){

        setVisible(true);
        setLocation(250, 100);
        setSize(1000, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new Panel();

        panel.setVisible(true);
        panel.setLocation(0, 0);
        panel.setSize(1000, 700);

        add(panel);

        menu = new JMenuBar();

        file = new JMenu("file");

        save = new JMenuItem("save");
        load = new JMenuItem("load");

        save.addActionListener(this);
        load.addActionListener(this);

        file.add(save);
        file.add(load);

        menu.add(file);
        setJMenuBar(menu);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();

        if(source == save){
            ((Panel) panel).zapisz();
        }
        if(source == load){
            ((Panel) panel).odczyt();
        }
    }

}
