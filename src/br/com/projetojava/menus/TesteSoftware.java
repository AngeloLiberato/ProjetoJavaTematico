package br.com.projetojava.menus;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.projetojava.actions.HomePageClickEvent;
import br.com.projetojava.actions.RedirectClickEvent;
import br.com.projetojava.actions.TemaClickEvent;
import br.com.projetojava.util.InitUtils;

public class TesteSoftware extends JPanel{
    private JLabel tema1 = new JLabel();
    private JLabel tema2 = new JLabel();
    private JLabel tema3 = new JLabel();
    private JLabel tema4 = new JLabel();
    private JLabel tema5 = new JLabel();
    private JLabel tema6 = new JLabel();
    private JLabel TdS = new JLabel();
    private JLabel atv = new JLabel();
    //private JLabel angularText = new JLabel();
    public TesteSoftware() {
		initComponents();
		initFundo();
		attatchListeners();
	}
	private void attatchListeners() {
		atv.addMouseListener(new RedirectClickEvent("https://drive.google.com/drive/folders/1qFU31ASMQX-3m7AmRxezEOABT5iphhxw?usp=sharing"));
		tema1.addMouseListener(new TemaClickEvent("pagtema1.png", "https://drive.google.com/file/d/1jnWKctTpYj1PdYzWLF-uOYBVkvZRQoO9/view?usp=sharing",1));
		tema2.addMouseListener(new TemaClickEvent("pagtema2.png", "https://drive.google.com/file/d/1vNYnlol2AOLhouB9nVDknAH-ciyRuAN5/view?usp=sharing", 2));
		tema3.addMouseListener(new TemaClickEvent("pagtema3.png", "https://drive.google.com/file/d/1GIrbSOJlWmPzmbUQv-_JliUKgWbFfkTc/view?usp=sharing",3));
		
                tema4.addMouseListener(new TemaClickEvent("pagtema4_1.png", "https://drive.google.com/file/d/1Gjl395Bf2L_vQfdMKPXN5TXSlO---bdb/view?usp=sharing",4));
		tema5.addMouseListener(new TemaClickEvent("pagtema5.png", "https://drive.google.com/file/d/1BEV2EWxNC9Ybc1hLNshCDzM9GIU2NOKe/view?usp=sharing",5));
		tema6.addMouseListener(new TemaClickEvent("pagtema6_1.png", "https://drive.google.com/file/d/1bzqqImFpYW4ejhryOa5-e5DI_o-FOqnQ/view?usp=sharing",6));


	}
	private void initComponents() {
		InitUtils init = new InitUtils();
		init.initLabelIcon(tema1, "tema1.png");
		init.initLabelIcon(tema2, "tema2.png");
		init.initLabelIcon(tema3, "tema3.png");
		init.initLabelIcon(tema4, "tema4.png");
		init.initLabelIcon(tema5, "tema5.png");
		init.initLabelIcon(tema6, "tema6.png");
		init.initLabelIcon(TdS, "testesdesoftware.png");
		init.initLabelIcon(atv, "atvpraticas.png");
	}
	
	
	private void initFundo() {
		javax.swing.GroupLayout fundoTdSLayout = new javax.swing.GroupLayout(this);
        this.setLayout(fundoTdSLayout);
        fundoTdSLayout.setHorizontalGroup(
            fundoTdSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoTdSLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(fundoTdSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TdS)
                    .addGroup(fundoTdSLayout.createSequentialGroup()
                        .addGroup(fundoTdSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(fundoTdSLayout.createSequentialGroup()
                                .addComponent(tema4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tema5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(fundoTdSLayout.createSequentialGroup()
                                .addComponent(tema1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tema2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fundoTdSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tema3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tema6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(atv, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        fundoTdSLayout.setVerticalGroup(
            fundoTdSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoTdSLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(TdS, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(fundoTdSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tema1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tema2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tema3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fundoTdSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tema4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tema5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tema6))
                .addGap(20, 20, 20)
                .addComponent(atv)
                .addContainerGap(90, Short.MAX_VALUE))
        );
	}
	
//	private void initTema(JLabel tema) {
//		javax.swing.GroupLayout temaLayout = new javax.swing.GroupLayout(tema);
//        tema6.setLayout(temaLayout);
//        temaLayout.setHorizontalGroup(
//        		temaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(temaLayout.createSequentialGroup()
//                .addGap(48, 48, 48)
//                .addGroup(temaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addComponent(jLabel22)
//                    .addComponent(jLabel23))
//                .addContainerGap(267, Short.MAX_VALUE))
//            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tema6Layout.createSequentialGroup()
//                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                .addComponent(retorno6)
//                .addGap(34, 34, 34))
//        );
//        temaLayout.setVerticalGroup(
//        	temaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(temaLayout.createSequentialGroup()
//                .addGap(62, 62, 62)
//                .addComponent(jLabel22)
//                .addGap(18, 18, 18)
//                .addComponent(jLabel23)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
//                .addComponent(retorno6)
//                .addGap(30, 30, 30))
//        );
//	}
}
