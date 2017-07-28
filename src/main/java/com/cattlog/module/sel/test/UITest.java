package com.cattlog.module.sel.test;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Path;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFileChooser.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.JFrame;
import javax.swing.JTextPane;

public class UITest {
	Path firefoxPath;
	JFrame frame;
	
	
	JTextPane xml;
	JButton btn1;
	public UITest(){
		initial();
	}
	public void initial(){
		
		frame=new JFrame("cato");
		xml=new JTextPane();
		btn1=new JButton();
	//主框设置
		frame.setBounds(100, 100, 645, 800);
		frame.getContentPane().setLayout(null);
		
	 //面板
		frame.add(xml);
		xml.setBounds(60, 70, 400, 60);
		xml.setEditable(false);
		xml.setBackground(Color.BLUE);
	//按鈕
		btn1.setBounds(500, 70, 40, 40);
		//獲取.class文件的方法
		btn1.setIcon(new ImageIcon(UITest.class.getResource("/javax/swing/plaf/metal/icons/ocean/directory.gif")));
		frame.getContentPane().add(btn1);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser(".");
				fileChooser.addChoosableFileFilter(new FileFilterTest() );
				JFrame frame=new JFrame("请选择文件");
				int returnValue = fileChooser.showOpenDialog(frame);
		        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);		       		 
		        if (returnValue == JFileChooser.APPROVE_OPTION) {
		        	File selectedFile = fileChooser.getSelectedFile();
		        	firefoxPath = selectedFile.toPath();
		        	refresh();
			}
			}
		});
	
	}
	public void refresh(){
		if(firefoxPath == null){
			xml.setText("默认为当前文件夹下的testcase.xlsm文件\n"+new File(System.getProperty("user.dir")+"/testcase.xlsm").toPath().toString());
			if(new File(System.getProperty("user.dir")+"/testcase.xlsm").exists()){
				xml.setForeground(Color.GREEN);
			}
			else{
				xml.setForeground(Color.RED);
			}
		}else{
			xml.setText(firefoxPath.toString());
			xml.setForeground(Color.BLACK);
		}}
	
	public static void main(String[] args) {
	//todo这里可以加一个线程
		UITest ui=new UITest();
		ui.frame.setVisible(true);
	}

}
