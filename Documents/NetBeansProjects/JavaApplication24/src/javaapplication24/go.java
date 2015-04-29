/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;
import java.io.IOException;
import static javaapplication24.NotePad.b;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Qinghui
 */
public class go extends NotePad{
public void go()//go class
	{
		mb = new JMenuBar();
                //creating menu
		m = new JMenu("File");
		m1 = new JMenu("Edit");
		m2 = new JMenu("Help");
		m3 = new JMenu("Info");
                //creating menu items
		mi1 = new JMenuItem("Open");
		mi1.addActionListener(this);
		mi2 = new JMenuItem("Save");
		mi2.addActionListener(this);
		mi3 = new JMenuItem("Delete");
		mi3.addActionListener(this);
		mi4 = new JMenuItem("Copy");
		mi4.addActionListener(this);
		mi5 = new JMenuItem("Paste");
		mi5.addActionListener(this);
		mi6 = new JMenuItem("Cut");
		mi6.addActionListener(this);
		mi7 = new JMenuItem("Help Info");
		mi7.addActionListener(this);
		mi8 = new JMenuItem("Patch Info");
		mi8.addActionListener(this);
		mi9 = new JMenuItem("Clear");
		mi9.addActionListener(this);
		mi10 = new JMenuItem("New");
		mi10.addActionListener(this);
		
                //creating buttons and Jbutton images
		oB = new JButton();
		oB.setToolTipText("Open");
		oB.addMouseListener(this);
		try {
                Image img = ImageIO.read(getClass().getResource("image/Treeopen.gif"));
                oB.setIcon(new ImageIcon(img));
              } catch (IOException ex) {
              }
                
		sB = new JButton();
		sB.setToolTipText("Save");
		sB.addMouseListener(this);
                try {
                Image img = ImageIO.read(getClass().getResource("image/icon_save.gif"));
                sB.setIcon(new ImageIcon(img));
              } catch (IOException ex) {
              }
		
		dB = new JButton();
		dB.setToolTipText("Delete");
		dB.addMouseListener(this);
                try {
                Image img = ImageIO.read(getClass().getResource("image/delete_16x16.gif"));
                dB.setIcon(new ImageIcon(img));
              } catch (IOException ex) {
              }
                
		
		cB = new JButton();
		cB.setToolTipText("Copy");
		cB.addMouseListener(this);
                try {
                Image img = ImageIO.read(getClass().getResource("image/39295_16719_copy_16x16.gif"));
                cB.setIcon(new ImageIcon(img));
              } catch (IOException ex) {
              }
		
		pB = new JButton();
		pB.setToolTipText("Paste");
		pB.addMouseListener(this);
                try {
                Image img = ImageIO.read(getClass().getResource("image/39467_16903_paste_16x16.gif"));
                pB.setIcon(new ImageIcon(img));
              } catch (IOException ex) {
              }
		
		cutB = new JButton();
		cutB.setToolTipText("Cut");
		cutB.addMouseListener(this);
                try {
                Image img = ImageIO.read(getClass().getResource("image/cut.gif"));
                cutB.setIcon(new ImageIcon(img));
              } catch (IOException ex) {
              }
                
		
		clB = new JButton();
		clB.setToolTipText("Clear");
		clB.addMouseListener(this);
                try {
                Image img = ImageIO.read(getClass().getResource("image/clear.gif"));
                clB.setIcon(new ImageIcon(img));
              } catch (IOException ex) {
              }
                
                
		//create a layout
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));
                //adding buttons to the layout
		jp.add(oB);
		jp.add(sB);
		jp.add(dB);
		jp.add(cB);
		jp.add(pB);
		jp.add(cutB);
		jp.add(clB);
		//adding menu items to the menu
		m.add(mi1);
		m.add(mi2);
		m.add(mi3);
		m.add(mi10);
		
		m1.add(mi4);
		m1.add(mi5);
		m1.add(mi6);
		m1.add(mi9);
		
		m2.add(mi7);
		m2.add(mi8);
		//adding menu to the menu bar
		mb.add(m);
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		
		Container cp = frame.getContentPane();
		frame.setJMenuBar(mb);//adding menu bar to the layout
		cp.add(jp, BorderLayout.NORTH);
		cp.add(jsp,BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//setting close for the program
		frame.setSize(600,600);//size
		frame.setVisible(true);//visible
		tf.setLineWrap(true);
		tf.setEnabled(b);
	}
}