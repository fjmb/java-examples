package mx.com.fjmb.example.observables;

import java.util.Observable;
import java.util.Observer;

public class PrimerLectorNotificaciones implements Observer {
	public void update(Observable o, Object arg) {

		if (o instanceof NotificacionesWhatsapp) {
			System.out.println("Whatsapp :: PrimerLectorNotificaciones:" + (String) arg);
		}
		if (o instanceof NotificacionesTelegram) {
			System.out.println("NotificacionesTelegram :: PrimerLectorNotificaciones:" + (String) arg);
		}
	}

}
