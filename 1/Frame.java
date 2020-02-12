import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.System.exit;

public class Frame extends JFrame {
    private ItemCollection ic= new ItemCollection();
    private JButton statItem = new JButton("add Stationary Item");
    private JButton LabItem = new JButton("add Lab Item");
    private JButton Display = new JButton("Display all items");
    private JButton exit = new JButton("Exit");
    private JTextArea txt = new JTextArea(15,20);
    private JLabel n_item = new JLabel("item name:");
    private JLabel id_item= new JLabel("item ID:");
    private JLabel t_item= new JLabel("item type:");
    private JTextField t1= new JTextField(20);
    private JTextField t2= new JTextField(20);
    private JTextField t3 = new JTextField(20);
    private JPanel panel= new JPanel();

    public Frame() {
        setSize(290, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComp();
    }
    void addComp() {

        panel.add(statItem);
        panel.add(LabItem);
        panel.add(Display);
        panel.add(exit);
        panel.add(txt);
        panel.add(n_item);
        panel.add(t1);
        panel.add(id_item);
        panel.add(t2);
        panel.add(t_item);
        panel.add(t3);
        add(panel);

        statItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ic.addStationaryItem(new StationaryItem(t1.getText(), Integer.parseInt(t2.getText()),Integer.parseInt(t3.getText())));
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
        });
        LabItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ic.addLabItem(new LabItem(t1.getText(), Integer.parseInt(t2.getText()),Integer.parseInt(t3.getText())));
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
        });

        Display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txt.setText(ic.toString());
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                exit(0);
            }
        });
}

}
