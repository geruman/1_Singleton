package com.geruman;

public class MundoSingleton {

	private static MundoSingleton instance=null;
	private String mensaje;
	
	private MundoSingleton() {
		
	}
	public static MundoSingleton getInstance() {
		if(instance==null) {
			instance = new MundoSingleton();
		}
		return instance;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
