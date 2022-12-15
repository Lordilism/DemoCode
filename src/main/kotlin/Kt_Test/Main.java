package Kt_Test;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello");
        JFrame jFrame= new JFrame("Tilte");
        JOptionPane jOptionPane=new JOptionPane("Error");
        jFrame.setBounds(300,300,1000,1000);
        jFrame.setVisible(true);
        jFrame.add(jOptionPane);
        
    }
}
