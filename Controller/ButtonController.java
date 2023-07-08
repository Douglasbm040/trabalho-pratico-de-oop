package Controller;



import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import Controller.Interfaces.Ionclick;





public class ButtonController implements Ionclick {
    @Override
    public void OnClick() {  
       /* JOptionPane.showMessageDialog(tela, "djkffashgdfkj");*/ 
    }
    
     public void OnClick(String text ,JFrame window,JTextComponent Component) {
       
       JOptionPane.showMessageDialog(window, Component.getText());
       
    }

   

   
    
}
