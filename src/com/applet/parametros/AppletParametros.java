package com.applet.parametros;

import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JApplet;
import javax.swing.JLabel;

public class AppletParametros extends JApplet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<String> listaParametros;

	@Override
	public void init() {
		listaParametros = new ArrayList<String>();
		int numPar = 0;
		String nombreParametro = "numeroParametros";
		String valor = this.getParameter(nombreParametro);

		try {
			numPar = Integer.parseInt(valor);
		} catch (NumberFormatException e) {
			System.out.println("El valor introducido no es un número");
		}

		for (int i = 1; i <= numPar; i++) {
			nombreParametro = "parametro" + i;
			valor = this.getParameter(nombreParametro);
			listaParametros.add(valor);
		}

		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
		add(new JLabel("Número de parámetros: " + numPar));
		for (int i = 0; i < listaParametros.size(); i++) {
			add(new JLabel("El valor del parámetro " + i + " es " + listaParametros.get(i)));
		}
	}

}
