package View.Components;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.text.JTextComponent;

import Controller.Interfaces.Ionclick;

public class ButtonComponent extends JButton{
    public ButtonComponent(String label,JFrame window,JTextComponent Component, Ionclick action){
        super(label);
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               action.OnClick(label,window,Component);
            }
        });

    }
    
       
    
}
