package br.com.projetojava.util;

import java.awt.Color;

import javax.swing.JLabel;

public class InitUtils {
	public static void initBackground() {
		
	}
	
	public void initLabelText(JLabel label,String text,int fontSize) {
		label.setFont(new java.awt.Font("Segoe UI Semibold", 0, fontSize)); // NOI18N
		label.setForeground(new Color(51, 51, 51));
		label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		label.setText(text);
	}
	public void initLabelText(JLabel label,String text,int fontSize,Color cor) {
		label.setFont(new java.awt.Font("Segoe UI Semibold", 0, fontSize)); // NOI18N
		label.setForeground(cor);
		label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		label.setText(text);
	}
	public void initLabelIcon(JLabel label,String src) {
		label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pages/" + src)));
	}
}
