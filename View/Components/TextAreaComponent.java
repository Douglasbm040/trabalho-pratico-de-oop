package View.Components;


import javax.swing.JTextArea;


public class TextAreaComponent extends JTextArea {
  
    public TextAreaComponent(String hint) {
        super(hint);
        this.changedUpdate();
  
    }
}
