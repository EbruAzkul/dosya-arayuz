/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arayuz;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class Arayuz {

    public static void main(String[] args) {
        //Frame Oluşturma
        JFrame frame = new JFrame("EBRU AZKUL");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
 
        //Menu componentleri oluşturma
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Dosya");
        JMenu m2 = new JMenu("Yardım");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Aç");
        JMenuItem m22 = new JMenuItem("Farklı Kaydet");
        m1.add(m11);
        m1.add(m22);
 
        //Panele componentlerin eklenmesi
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Birşey Yazın:");
        JTextField tf = new JTextField(10); // 10 karakterlik textarea
        JButton send = new JButton("Kaydet");
        JButton reset = new JButton("Temizle");
        panel.add(label); // Componentlerin Flow Layout'a eklenmesi
        panel.add(label); // Componentlerin Flow Layout'a eklenmesi
        panel.add(tf);
        panel.add(send);
        panel.add(reset);
 
        // Text Area at the Center
        JTextArea ta = new JTextArea();
 
        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.PAGE_START, mb);
        frame.getContentPane().add(BorderLayout.PAGE_END, panel);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
        
    }
 
}
        
    

