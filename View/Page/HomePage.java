package View.Page;


import javax.swing.JFrame;

import View.Components.ButtonComponent;
import View.Components.LabelComponent;
import View.Components.TextAreaComponent;


public class HomePage {

    JFrame window = new JFrame("Cadastro de sentencas");
    LabelComponent label = new LabelComponent("Olá, mundo!");
    TextAreaComponent textarea = new TextAreaComponent("dica");
    ButtonComponent Button = new ButtonComponent("entrar");
    
    
    public void run() {
        window.setSize(400, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(label);
        window.add(textarea);
        window.add(Button);
        window.setVisible(true);
    }
}

