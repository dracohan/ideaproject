package c13;
/**
 * @project: ThinkingInJava
 * @filename: JButtonDemo.java
 * @version: 0.10
 * @author: Jimmy Han
 * @date: 10:31 AM 8/11/15
 * @comment: Test Purpose
 * @result:
 */

//: JButtonDemo.java
// Looks like Java 1.1 but with J's added
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
public class JButtonDemo extends Applet {
    JButton
            b1 = new JButton("JButton 1"),
            b2 = new JButton("JButton 2");
    JTextField t = new JTextField(50);
    public void init() {
        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String name =
                        ((JButton)e.getSource()).getText();
                t.setText(name + " Pressed");
            }
        };
        b1.addActionListener(al);
        add(b1);
        b2.addActionListener(al);
        add(b2);
        add(t);
    }
    public static void main(String args[]) {
        JButtonDemo applet = new JButtonDemo();
        JFrame frame = new JFrame("TextAreaNew");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        frame.getContentPane().add(
                applet, BorderLayout.CENTER);
        frame.setSize(300,100);
        applet.init();
        applet.start();
        frame.setVisible(true);
    }
} ///:
