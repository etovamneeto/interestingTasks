/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapplet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import javax.swing.JApplet;
import java.applet.Applet;

/**
 *
 * @author lovachevss
 */
public class JavaJump extends JApplet {

    private Image jumpingJava;
    
        public void init() {
        setBackground(Color.WHITE);
        setFont(new Font("SansSerif", Font.BOLD,18 ));
        jumpingJava = getImage(getDocumentBase(), "images/Jumping-Java.gif");
        add(new Label("Great Jumping Java!"));
        System.out.println("Yow! I'm jumping with Java!");
    }
    
    public void paint(Graphics value){
        value.drawImage(jumpingJava, 0, 50, this);
    }
}
