package app;

import javax.swing.*;

public class Test1 {

    public static void main(String [] args) {
        String n = JOptionPane.showInputDialog(null, "Digite seu nome");
        int i = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua idade"));
        JOptionPane.showMessageDialog(null, "Olá" + " " + n + " " + "tudo bem?" + " " + "Então você tem " + i + " " + "anos!");

    }
    
}
