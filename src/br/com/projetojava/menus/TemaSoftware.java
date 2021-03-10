package br.com.projetojava.menus;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.projetojava.actions.HomePageClickEvent;
import br.com.projetojava.actions.RedirectClickEvent;
import br.com.projetojava.util.InitUtils;

public class TemaSoftware extends JPanel {
	//variaveis
	private String link;
	private String srcTema;
	private int index;
	//componentes
	private JLabel temaTopicos = new JLabel();
	private JLabel temaResumo = new JLabel();
	private JLabel retorno = new JLabel();
	
	public TemaSoftware(String link, String src, int index) {
		this.link = link;
		this.srcTema = src;
		this.index = index;
		initComponents();
		initFundo();
		attachListeners();
	}
	
	private void attachListeners() {
		temaResumo.addMouseListener(new RedirectClickEvent(link));
		retorno.addMouseListener(new HomePageClickEvent(TesteSoftware.class));
	}

	private void initComponents() {
		InitUtils util = new InitUtils();
		util.initLabelIcon(temaTopicos, srcTema);
		util.initLabelIcon(temaResumo, "resumodotema.png");
		util.initLabelIcon(retorno, "retornarpag.png");
	}
	private void initFundo() {
		this.setBackground(new java.awt.Color(231, 231, 231));
        javax.swing.GroupLayout Layout = new javax.swing.GroupLayout(this);
        this.setLayout(Layout);
        switch (index) {
		case 1:
                        Layout.setHorizontalGroup(
                        Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(temaTopicos)
                    .addComponent(temaResumo))
                .addContainerGap(317, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(retorno)
                .addGap(34, 34, 34))
        );
        Layout.setVerticalGroup(
            Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(temaTopicos)
                .addGap(18, 18, 18)
                .addComponent(temaResumo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(retorno)
                .addGap(30, 30, 30))
        );
        break;
		case 2:
			Layout.setHorizontalGroup(
					Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(Layout.createSequentialGroup()
	                .addGap(48, 48, 48)
	                .addGroup(Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(temaTopicos)
	                    .addComponent(temaResumo))
	                .addContainerGap(51, Short.MAX_VALUE))
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Layout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(retorno)
	                .addGap(34, 34, 34))
	        );
			Layout.setVerticalGroup(
					Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(Layout.createSequentialGroup()
	                .addGap(62, 62, 62)
	                .addComponent(temaTopicos, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(temaResumo)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
	                .addComponent(retorno)
	                .addGap(30, 30, 30))
	        );
                        break;
		case 3:
			Layout.setHorizontalGroup(
					Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(Layout.createSequentialGroup()
		                .addGap(48, 48, 48)
		                .addGroup(Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addComponent(temaTopicos)
		                    .addComponent(temaResumo))
		                .addContainerGap(76, Short.MAX_VALUE))
		            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Layout.createSequentialGroup()
		                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                .addComponent(retorno)
		                .addGap(34, 34, 34))
		        );
			Layout.setVerticalGroup(
					Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(Layout.createSequentialGroup()
		                .addGap(62, 62, 62)
		                .addComponent(temaTopicos)
		                .addGap(18, 18, 18)
		                .addComponent(temaResumo)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
		                .addComponent(retorno)
		                .addGap(30, 30, 30))
		        );
			break;
                case 4:
                    Layout.setHorizontalGroup(
            Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(temaTopicos)
                    .addComponent(temaResumo))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(retorno)
                .addGap(34, 34, 34))
        );
        Layout.setVerticalGroup(
            Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(temaTopicos)
                .addGap(18, 18, 18)
                .addComponent(temaResumo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(retorno)
                .addGap(30, 30, 30)));
                    break;
                case 5:
                    Layout.setHorizontalGroup(
            Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(temaTopicos)
                    .addComponent(temaResumo))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(retorno)
                .addGap(34, 34, 34))
        );
        Layout.setVerticalGroup(
            Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(temaTopicos)
                .addGap(18, 18, 18)
                .addComponent(temaResumo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(retorno)
                .addGap(30, 30, 30))
        );
        break;
                case 6:
                    Layout.setHorizontalGroup(
            Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(temaTopicos)
                    .addComponent(temaResumo))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(retorno)
                .addGap(34, 34, 34))
        );
        Layout.setVerticalGroup(
            Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(temaTopicos)
                .addGap(18, 18, 18)
                .addComponent(temaResumo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(retorno)
                .addGap(30, 30, 30)));
                    break;
		default:
			break;
		}
		
	}
}
