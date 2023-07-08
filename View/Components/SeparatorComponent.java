package View.Components;

import  javax.swing.JPanel;
import javax.swing.JSeparator;

public class SeparatorComponent extends JSeparator{
    private JPanel panel;

    public SeparatorComponent(){
        super(JSeparator.VERTICAL);
        panel = new JPanel();
        panel.add(this);
    }

  
     
    
       
}