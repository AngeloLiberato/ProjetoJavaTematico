package br.com.projetojava.main;

import javax.swing.JFrame;
import javax.swing.JPanel;

import br.com.projetojava.menus.Analytics;
import br.com.projetojava.menus.Home;
import br.com.projetojava.menus.Principal;

public class Main {
	
	public static Principal principal = new Principal();
	
	public static void main(String[] args) {
		//new Principal();
		//panelJframe(new Analytics());
	}
	
	public static void panelJframe(JPanel jp) {
		JFrame jf = new JFrame();
		jf.add(jp);
		jf.setVisible(true);
		jf.setResizable(true);
	}

}
