package mx.com.fjmb.example.observables;

public class ObservadoresMain {

	// Run Observer and Observable
	public static void main(String args[]) {
		NotificacionesWhatsapp notificacionesWhatsapp = new NotificacionesWhatsapp();
		NotificacionesTelegram notificacionesTelegram = new NotificacionesTelegram();

		PrimerLectorNotificaciones lector1 = new PrimerLectorNotificaciones();
		SegundoLectorNotificaciones lector2 = new SegundoLectorNotificaciones();
		
		notificacionesWhatsapp.addObserver(lector1);
		notificacionesWhatsapp.addObserver(lector2);

//		notificacionesTelegram.addObserver(lector1);
		notificacionesWhatsapp.notificaciones();
//		notificacionesTelegram.notificaciones();


	}
}
