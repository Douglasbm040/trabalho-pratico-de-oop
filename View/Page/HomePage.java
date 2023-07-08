package View.Page;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import Controller.ButtonController;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import View.Components.ButtonComponent;
import View.Components.LabelComponent;
import View.Components.TextAreaComponent;
import View.Components.TextFieldComponent;


public class HomePage {
    JFrame window = new JFrame("Cadastro de sentenças");
    JPanel contentPanel = new JPanel(new GridBagLayout());
    ButtonController Controller = new ButtonController();

    public void run() {
        window.setSize(700, 700);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setContentPane(contentPanel);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(5, 5, 5, 5);

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.weightx = 1.0;
        contentPanel.add(new LabelComponent("Sentença:"), constraints);

        constraints.gridy = 1;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        contentPanel.add(new TextAreaComponent(""), constraints);

        constraints.gridy = 2;
        constraints.weighty = 0.0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.WEST;
        contentPanel.add(createButtonComponent("Salvar", 0.2), constraints);

        constraints.gridy = 3;
        constraints.weighty = 0.0;
        constraints.fill = GridBagConstraints.BOTH;
        contentPanel.add(createSeparatorPanel(), constraints);

        constraints.gridy = 4;
        constraints.weightx = 0.0;
        contentPanel.add(new LabelComponent("  Listagem de sentenças"), constraints);

        constraints.gridy = 5;
        constraints.weighty = 0.0;
        constraints.fill = GridBagConstraints.BOTH;
        JPanel searchPanel = createSearchPanel();
        contentPanel.add(searchPanel, constraints);

        constraints.gridy = 6;
        constraints.weighty = 0.0;
        constraints.anchor = GridBagConstraints.WEST;
        contentPanel.add(createButtonComponent("Listar Todas", 0.2), constraints);

        constraints.gridy = 7;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        contentPanel.add(new TextAreaComponent(""), constraints);

        window.setVisible(true);
    }

    private JPanel createButtonComponent(String buttonText, double buttonWidth) {
        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.weightx = buttonWidth;
        constraints.anchor = GridBagConstraints.WEST;

        ButtonComponent button = new ButtonComponent(buttonText,window,Controller);
        panel.add(button, constraints);

        return panel;
    }

    private JPanel createSearchPanel() {
        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(5, 5, 5, 5);

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 0.0;
        panel.add(new LabelComponent("Busca por expressão:"), constraints);

        constraints.gridx = 1;
        constraints.weightx = 1.0;
        panel.add(new TextFieldComponent(), constraints);

        constraints.gridx = 2;
        constraints.weightx = 0.0;
        panel.add(new ButtonComponent("Buscar",window,Controller), constraints);

        return panel;
    }

    private JPanel createSeparatorPanel() {
        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = GridBagConstraints.REMAINDER;

        JSeparator separator = new JSeparator(JSeparator.HORIZONTAL);
        separator.setPreferredSize(new Dimension(660, 1));
        panel.add(separator, constraints);

        return panel;
    }
}

