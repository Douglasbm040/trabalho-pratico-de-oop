package View.Components;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Controller.Interfaces.Ionclick;

public class ButtonComponent extends JButton{
    
    
    
    public ButtonComponent(String label,Component window, Ionclick action){
        super(label);
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               // JOptionPane.showMessageDialog(window, "O botão foi clicado!");
               action.OnClick(label,window);
            }
        });

    }
    
       
    
}
