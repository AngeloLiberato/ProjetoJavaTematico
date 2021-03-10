package br.com.projetojava.menus;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.projetojava.actions.RedirectClickEvent;
import br.com.projetojava.util.InitUtils;

public class Angular extends JPanel{
    private JLabel angularText = new JLabel();
    private JLabel projectText = new JLabel();
    private JLabel projectIcon = new JLabel();
    private JLabel projectButton = new JLabel();
    //private JLabel angularText = new JLabel();
    public Angular() {
		initComponents();
		initFundo();
	}
	private void initComponents() {
		InitUtils init = new InitUtils();
		init.initLabelIcon(angularText, "angular.png");
		init.initLabelIcon(projectText, "tourofheroes.png");
		init.initLabelIcon(projectIcon, "tourofheroesimg.png");
		init.initLabelIcon(projectButton, "acesseoprojeto.png");
		projectButton.addMouseListener(new RedirectClickEvent("https://angular-ivy-gq7gvq.stackblitz.io/"));
	}
	
	
	private void initFundo() {
		this.setBackground(new java.awt.Color(231, 231, 231));		
        javax.swing.GroupLayout fundoAngular2Layout = new javax.swing.GroupLayout(this);
        this.setLayout(fundoAngular2Layout);
        fundoAngular2Layout.setHorizontalGroup(
            fundoAngular2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoAngular2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(fundoAngular2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(angularText)
                    .addGroup(fundoAngular2Layout.createSequentialGroup()
                        .addComponent(projectText)
                        .addGap(18, 18, 18)
                        .addGroup(fundoAngular2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(projectIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(projectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        fundoAngular2Layout.setVerticalGroup(
            fundoAngular2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoAngular2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(angularText)
                .addGroup(fundoAngular2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoAngular2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(projectText, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundoAngular2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(projectIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(projectButton)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
	}
}