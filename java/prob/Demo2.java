package oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Demo2 extends JApplet implements ActionListener {
    public void init() {
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        JLabel label = new JLabel(getParameter("greeting"),SwingConstants.CENTER);
        label.setFont(new Font("TimesRoman",Font.BOLD,18));
        container.add(label,"Center");
        JPanel panel = new JPanel();
        cayButton = new JButton("Cay Horstmann");
        cayButton.addActionListener(this);
        panel.add(cayButton);
        garyButton = new JButton("Gary Cornell");
        garyButton.addActionListener(this);
        panel.add(garyButton);
        container.add(panel,"South");
    }
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        String urlName;
        if(source == cayButton)
            urlName = "http://www.horstmann.com";
        else if (source == garyButton)
            urlName = "www.google.com";
        else
            return;
        try {
            URL u = new URL(urlName);
            getAppletContext().showDocument(u);
        }
        catch (Exception ee) {
            showStatus("Error" +ee);
        }
    }
    private JButton  cayButton;
    private JButton garyButton;
}
