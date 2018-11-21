package mx.com.fjmb.example.threads.executorservice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubmitRunable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(10);

		Future future = executorService.submit(new Runnable() {
			public void run() {
				System.out.println("Asynchronous task");
			}
		});
		Thread.sleep(1000);

		System.out.println(future.get()); // returns null if the task has
		// finished correctly.

		// Future future = executorService.submit(new Callable() {
		// public Object call() throws Exception {
		// System.out.println("Asynchronous Callable");
		// return "Callable Result";
		// }
		// });
		//
		// System.out.println("future.get() = " + future.get());
	}

}
