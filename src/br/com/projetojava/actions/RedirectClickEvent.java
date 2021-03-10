package br.com.projetojava.actions;

import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

public class RedirectClickEvent extends MouseAdapter{
	String link;
	public RedirectClickEvent(String link) {
		this.link = link;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		try{
            if (Desktop.isDesktopSupported()){
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)){
                    desktop.browse(new URI(link));
                }
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
	}
	
}