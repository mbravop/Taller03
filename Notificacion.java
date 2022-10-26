package prueba;

import java.lang.reflect.Method;

public class Notificacion {

	
	public static void enviarEmail() {
		
	}
	public static void enviarSMS() {
		
	}
	
	private Notificable tipoNotificacion;
	
	public void notificar(Pago pago) {
		tipoNotificacion.enviarNotf();
	
	}
}

class tipo1 implements Notificable{

	public void enviarNotf() {
		Notificacion.enviarEmail();
	}
}

class tipo2 implements Notificable{
	public void enviarNotf() {
		Notificacion.enviarSMS();
	}
}