/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetojava.util;

/**
 *
 * @author pedro
 */
public class DropboxRequest {
	String path;
	String mode;
	boolean autorename;
	boolean mute;
	boolean strict_conflict;
	public DropboxRequest(String path) {
		this.mode = "add";
		this.path = path;
		this.autorename = true;
		this.mute = true;
		this.strict_conflict = true;
	}
}
