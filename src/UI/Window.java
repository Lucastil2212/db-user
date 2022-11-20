package UI;

import javax.swing.*;

public class Window {
    JFrame mainWindowFrame;
    JButton insertButton;
    public Window(){
        mainWindowFrame = new JFrame();
        
        insertButton = new JButton("insert");

        insertButton.setBounds(120, 100, 100, 40);

        mainWindowFrame.add(insertButton);
        mainWindowFrame.setSize(500, 500);
        mainWindowFrame.setLayout(null);
        mainWindowFrame.setVisible(true);


    }
}
