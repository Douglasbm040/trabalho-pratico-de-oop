package View.Components;


import javax.swing.JTextArea;
//import javax.swing.JScrollPane;

public class TextAreaComponent extends JTextArea {
  
    public TextAreaComponent(String hint) {
        super(hint,10, 100);

       /*
       JFrame frame = new JFrame("Exemplo JTextArea");

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        frame.getContentPane().add(scrollPane);
       
       */ 

  
    }
}
