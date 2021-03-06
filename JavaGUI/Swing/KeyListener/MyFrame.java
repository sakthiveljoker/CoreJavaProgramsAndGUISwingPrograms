package JavaGUI.Swing.KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon icon=new ImageIcon("E:\\png file\\jokeremoji.png");
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        label=new JLabel();
        label.setBounds(0,0,100,100);
        label.setIcon(icon);
        this.add(label);
        this.getContentPane().setBackground(Color.BLACK);
        this.addKeyListener(this);
        this.setSize(400,400);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()){
            case 'a':
                label.setLocation(label.getX()-10,label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(),label.getY()-10);
                break;
            case 'e':
                label.setLocation(label.getX(),label.getY()+10);
                break;
            case 'd':
                label.setLocation(label.getX()+10,label.getY());

        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case 37:
                label.setLocation(label.getX()-10,label.getY());
                break;
            case 38:
                label.setLocation(label.getX(),label.getY()-10);
                break;
            case 39:
                label.setLocation(label.getX()+10,label.getY()
                );
                break;
            case 40:
                label.setLocation(label.getX(),label.getY()+10);



        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("The keylistener char is "+e.getKeyChar());
        System.out.println("The keylistener code id "+e.getKeyCode());

    }
}
