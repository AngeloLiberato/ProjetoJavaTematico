package br.com.projetojava.menus;

import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.projetojava.actions.HomePageClickEvent;

public class Principal extends JFrame {
	
	private JPanel barraLateral = new JPanel();
	
	//os bot�es
    private JPanel buttonHome = new JPanel();
    private JPanel buttonAnalytics = new JPanel();
    private JPanel buttonScrum = new JPanel();
    private JPanel buttonTdS = new JPanel();
    private JPanel buttonAngular = new JPanel();
    private JPanel buttonUpload = new JPanel();
    
    //o texto dos bot�es
    private JLabel home = new JLabel();
    private JLabel testesDeSoftware = new JLabel();
    private JLabel scrum = new JLabel();
    private JLabel analytics = new JLabel();
    private JLabel angular = new JLabel();
    private JLabel upload = new JLabel();
    
    //o �cone dos bot�es
    private JLabel iconHome = new JLabel();
    private JLabel iconAnalytics = new JLabel();
    private JLabel iconAngular = new JLabel();
    private JLabel iconScrum = new JLabel();
    private JLabel iconTdS = new JLabel();
    private JLabel iconUpload = new JLabel();
	
    private JPanel panel;
    
	public Principal() {
		initComponents();
		attachComponents();
		configPage();
		attachListeners();
		this.setVisible(true);
	}
	

	private void attachListeners() {
		buttonAnalytics.addMouseListener(new HomePageClickEvent(Analytics.class));
		buttonHome.addMouseListener(new HomePageClickEvent(Home.class));
		buttonScrum.addMouseListener(new HomePageClickEvent(Scrum.class));
		buttonAngular.addMouseListener(new HomePageClickEvent(Angular.class));
		buttonTdS.addMouseListener(new HomePageClickEvent(TesteSoftware.class));
                buttonUpload.addMouseListener(new HomePageClickEvent(Upload.class));
	}
	
	public void changePanel(JPanel panel) {
		this.remove(this.panel);
		this.getContentPane().remove(this.panel);
		initPanel(panel);
		this.revalidate();
		this.repaint();
	}


	/**
	 * 
	 */
	private JPanel initYellowBar() {
            JPanel bar = new JPanel();
            GroupLayout Layout = new javax.swing.GroupLayout(bar);
            bar.setBackground(new java.awt.Color(237, 193, 49));
            bar.setLayout(Layout);
            Layout.setHorizontalGroup(
			Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
            );
            Layout.setVerticalGroup(
        	Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            );
            return bar;
	}

	/**
	 * 
	 */
	private void configPage() {
//		/737 922
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new Rectangle(922, 737));
        setResizable(false);
        
	}

	/**
	 * 
	 */
	

	private void attachComponents() {
            this.add(barraLateral);
            barraLateral.add(buttonHome);
            barraLateral.add(buttonAnalytics);
            barraLateral.add(buttonScrum);
            barraLateral.add(buttonTdS);
            barraLateral.add(buttonAngular);
            barraLateral.add(buttonUpload);
            
	}
	
	private void initComponents() {
            initBar();
            initIcon(home,iconHome,"/pages/home_page_24px.png", "Página inicial");
            initIcon(testesDeSoftware,iconTdS,"/pages/pass_fail_24px.png", "Testes De Software");
            initIcon(scrum,iconScrum,"/pages/event_24px.png", "Scrum");
            initIcon(analytics,iconAnalytics,"/pages/increase_24px.png", "Analytics");
            initIcon(angular,iconAngular,"/pages/google_code_24px.png", "Angular");
            initIcon(upload, iconUpload, "/pages/icon_upload_24px.png", "Upload");
            
            initButton(buttonHome, iconHome, home);
            initButton(buttonTdS, iconTdS, testesDeSoftware);
            initButton(buttonAnalytics, iconAnalytics, analytics);
            initButton(buttonScrum, iconScrum, scrum);
            initButton(buttonAngular, iconAngular, angular);
            initButton(buttonUpload, iconUpload, upload);
        
            initPanel(new Home());
        
//        buttonTdS.setLayout(buttonTdSLayout);
//        buttonTdS.setBackground(new java.awt.Color(33, 45, 73));
        
	}

	private void initPanel(JPanel jpanel) {
		 GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addComponent(barraLateral, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                .addGap(0, 640, Short.MAX_VALUE))
	            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                    .addGap(0, 260, Short.MAX_VALUE)
	                    .addComponent(jpanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	            .addComponent(barraLateral, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                .addComponent(jpanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        this.panel = jpanel;
		
	}

	/**
	 * 
	 */
	private void initIcon(JLabel Ltext, JLabel Licon,String src, String text) {
		// 
		Licon.setIcon(new javax.swing.ImageIcon(getClass().getResource(src))); // NOI18N
		Ltext.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
		Ltext.setForeground(new java.awt.Color(231, 231, 231));
		Ltext.setText(text);
	}

	/**
	 * 
	 */
	private void initBar() {
		barraLateral.setBackground(new java.awt.Color(25, 28, 53));
        GroupLayout barraLateralLayout = new javax.swing.GroupLayout(barraLateral);
		barraLateral.setLayout(barraLateralLayout);
        barraLateralLayout.setHorizontalGroup(
            barraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonAnalytics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonScrum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonTdS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonAngular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonUpload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        barraLateralLayout.setVerticalGroup(
            barraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLateralLayout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(buttonHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonAnalytics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonScrum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonTdS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonAngular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonUpload)
                .addContainerGap(65, Short.MAX_VALUE)
            )
        );
	}
	
	private void initButton(JPanel button, JLabel icon, JLabel btn) {
            JPanel bar = initYellowBar();
		GroupLayout Layout = new GroupLayout(button);
		Layout.setHorizontalGroup(
	            Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Layout.createSequentialGroup()
	                .addGap(0, 0, 0)
	                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addComponent(icon)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(btn, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
	                .addContainerGap())
	        );
	        Layout.setVerticalGroup(
	            Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(Layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(btn, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
	                    .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addContainerGap())
	            .addComponent(bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        button.setLayout(Layout);
	        button.setBackground(new java.awt.Color(33, 45, 73));
	}
	
}