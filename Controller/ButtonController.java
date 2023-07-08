package Controller;



import java.awt.Component;

import javax.swing.JOptionPane;

import Controller.Interfaces.Ionclick;

public class ButtonController implements Ionclick{

    @Override
    public void OnClick() {
       System.out.println("AUSDIFHASDKJFHLKAJSHDKFHKLAJSHDFJHAKLJSHDLKFJHLKAJS");
    }

    @Override
    public void OnClick(String text ,Component window) {
       JOptionPane.showMessageDialog(window, text);
       
    }
    
}
