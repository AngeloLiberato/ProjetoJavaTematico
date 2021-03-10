package br.com.projetojava.menus;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.projetojava.util.InitUtils;

public class Home extends JPanel{
	private JLabel homeText1 = new JLabel();
	private JLabel homeText2 = new JLabel();
	private JLabel homeIcon = new JLabel();
	public Home() {
		initComponents();
		initFundo();
	}


	/**
	 * 
	 */
	private void initComponents() {
		InitUtils util = new InitUtils();
		util.initLabelText(homeText1, "Bem-Vindos", 40,new Color(51, 51, 51));
		util.initLabelText(homeText2, "Clique nos menus laterais para navegar pelas páginas", 22, new Color(99, 99, 99));
		util.initLabelIcon(homeIcon, "home.png");
	}

	private void initFundo() {
		this.setBackground(new java.awt.Color(231, 231, 231));
		
		javax.swing.GroupLayout fundoHomeLayout = new javax.swing.GroupLayout(this);
        
		fundoHomeLayout.setHorizontalGroup(
	            fundoHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoHomeLayout.createSequentialGroup()
	                .addGroup(fundoHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addGroup(fundoHomeLayout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(homeIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fundoHomeLayout.createSequentialGroup()
	                        .addGap(10, 10, 10)
	                        .addGroup(fundoHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(homeText1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(homeText2, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE))))
	                .addContainerGap())
	        );
	        fundoHomeLayout.setVerticalGroup(
	            fundoHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoHomeLayout.createSequentialGroup()
	                .addContainerGap(99, Short.MAX_VALUE)
	                .addComponent(homeText1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(homeText2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addComponent(homeIcon)
	                .addGap(103, 103, 103))
	        );
	        
	        this.setLayout(fundoHomeLayout);
		
	}
}