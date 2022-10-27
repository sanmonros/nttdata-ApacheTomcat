package com.nttdata.tomcat;

public class NTTDataJSP {

	/**
	 * Constructor privado
	 */
	
	private NTTDataJSP() {
		
	}
	
	/**
	 * Saludo mediante JSP
	 * 
	 * @param saludo
	 * @return
	 */
	public static String nttDataHello(String saludo) {
		return "Bienvenido al proyecto FP dual " + saludo;
	}
}
