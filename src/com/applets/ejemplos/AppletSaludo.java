package com.applets.ejemplos;

import javax.swing.JApplet;
import javax.swing.JLabel;

public class AppletSaludo extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() {
		String textoHtml = "KAIXO GUZTIOI";
		JLabel etiqueta = new JLabel(textoHtml, JLabel.CENTER);
		add(etiqueta);
	}

}
