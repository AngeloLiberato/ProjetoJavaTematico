package br.com.projetojava.menus;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.projetojava.util.InitUtils;

public class Scrum extends JPanel {
	JLabel fundo = new JLabel();
	public Scrum() {
		initComponents();
		initFundo();
	}

	private void initFundo() {
		javax.swing.GroupLayout fundoAnalyticsLayout = new javax.swing.GroupLayout(this);
		fundoAnalyticsLayout.setHorizontalGroup(
	            fundoAnalyticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(fundoAnalyticsLayout.createSequentialGroup()
	                .addGap(46, 46, 46)
	                .addComponent(fundo)
	                .addContainerGap(53, Short.MAX_VALUE))
	        );
	        fundoAnalyticsLayout.setVerticalGroup(
	            fundoAnalyticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(fundoAnalyticsLayout.createSequentialGroup()
	                .addGap(60, 60, 60)
	                .addComponent(fundo)
	                .addContainerGap(174, Short.MAX_VALUE))
	        );
	        this.setLayout(fundoAnalyticsLayout);
	}

	private void initComponents() {
		InitUtils util = new InitUtils();
        this.setBackground(new java.awt.Color(231, 231, 231));
        util.initLabelIcon(fundo, "scrum.png");
		
	}
}