package mx.com.fjmb.example.threads.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainProducerConsumerService {

	public static void main(String[] args) {
//		ExecutorService executorService = Executors.newFixedThreadPool(10);
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		executorService.execute(new Runnable() {
			public void run() {
				System.out.println("Asynchronous task");
			}
		});

		executorService.shutdown();
	}

}
