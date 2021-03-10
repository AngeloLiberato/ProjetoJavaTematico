package br.com.projetojava.actions;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import br.com.projetojava.main.Main;
import br.com.projetojava.menus.TemaSoftware;

public class TemaClickEvent extends MouseAdapter{
	private String source;
	private String link;
	private int index;
	
	public TemaClickEvent(String source, String link, int index) {
		this.source = source;
		this.index = index;
		this.link = link;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		Main.principal.changePanel(new TemaSoftware(link, source,index));
	}
}
