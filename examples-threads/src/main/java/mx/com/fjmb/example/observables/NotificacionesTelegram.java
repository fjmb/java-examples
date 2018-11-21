package mx.com.fjmb.example.observables;

import java.util.Observable;

public class NotificacionesTelegram extends Observable {
	void notificaciones() {
		String[] news = { "Notificacion 1", "Notificacion 2", "Notificacion 3" };
		for (String s : news) {
			// Aplicar cambio del observable
			setChanged();
			// Notificar a observadores el cambio 
			notifyObservers(s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Ocurrió un error.");
			}
		}
	}
}
