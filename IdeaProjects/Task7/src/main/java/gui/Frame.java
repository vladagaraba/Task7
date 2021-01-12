package gui;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame{
    private JPanel mainPanel;
    private JButton buttonGetResult;
    private JTextPane inputPane;
    private JTextPane outputPane;
    private JLabel inputDescr;
    private JLabel outputDescr;

    public Frame() throws HeadlessException {
        setContentPane(mainPanel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(1000, 800);

        buttonGetResult.addActionListener(new ButtonResultController(inputPane, outputPane));

        outputPane.setEnabled(false);
    }
}
