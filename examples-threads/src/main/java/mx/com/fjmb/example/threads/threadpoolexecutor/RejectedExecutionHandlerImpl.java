package mx.com.fjmb.example.threads.threadpoolexecutor;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class RejectedExecutionHandlerImpl implements RejectedExecutionHandler {

	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {

		System.out.println(r.toString() + " is rejected");
		if (!executor.isShutdown()) {
			try {
				executor.getQueue().put(r);
			} catch (InterruptedException e) {
				;
			}
		}

	}

}
