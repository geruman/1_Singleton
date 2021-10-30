package com.geruman;
public class SingletonDemoMain {
	public static void main(String[] args) {
		System.out.println("Este es el ejemplo del patron singleton");
		MundoSingleton mundo = MundoSingleton.getInstance();
		mundo.setMensaje("Mensaje");
		System.out.println(mundo.getMensaje());
		MundoSingleton mundo2 = MundoSingleton.getInstance();
		mundo2.setMensaje("Mensaje 2");
		System.out.println(mundo.getMensaje());
		System.out.println("Mundo 2 es Mundo");
		System.out.println(mundo2==mundo);
	}
}
