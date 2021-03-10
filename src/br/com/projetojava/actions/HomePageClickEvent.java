package br.com.projetojava.actions;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import br.com.projetojava.main.Main;
import br.com.projetojava.menus.Analytics;
import br.com.projetojava.menus.Principal;

public class HomePageClickEvent extends MouseAdapter {
	Class<? extends JPanel> painel;
	
	public HomePageClickEvent(Class<? extends JPanel> panel) {
		this.painel = panel;
	}
	
	@Override
	public void mouseClicked(MouseEvent e){
		try {
			Main.principal.changePanel(painel.newInstance());
		} catch (InstantiationException | IllegalAccessException e1) {
			e1.printStackTrace();
		}
	}
}