package gui;

import common.Logic;
import console.InputUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

public class ButtonResultController implements ActionListener {

    JTextPane inputArrayTextPane;
    JTextPane outputResultTextPane;

    public ButtonResultController(JTextPane inputArrayTextPane, JTextPane outputResultTextPane) {
        this.inputArrayTextPane = inputArrayTextPane;
        this.outputResultTextPane = outputResultTextPane;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String arrayAsLine = inputArrayTextPane.getText();
        BigInteger[] array = InputUtils.toBigIntegerArray(arrayAsLine);
        outputResultTextPane.setText(Logic.getAmountOfFactorials(array).toString());
        outputResultTextPane.setEnabled(true);
    }
}
