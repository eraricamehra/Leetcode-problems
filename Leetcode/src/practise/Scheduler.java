package practise;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Scheduler {

	public void testScheduler() throws InterruptedException {

//		ExecutorService executor = Executors.newFixedThreadPool(10);
//        
//		ExecutorService executorService =
//				new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
		
//		
//		
//		Runnable runnableTask = () -> {
//			try {
//			TimeUnit.MILLISECONDS.sleep(300);
//			} catch (InterruptedException e) {
//			e.printStackTrace();
//			}
//			};
		
//			Callable callableTask = () -> {
//			TimeUnit.MILLISECONDS.sleep(300);
//			return "Task's execution";
//			};
		
//			List<Callable> callableTasks = new ArrayList<>();
//			callableTasks.add(callableTask);
//			callableTasks.add(callableTask);
//			callableTasks.add(callableTask);
//			
//			
//			
//			executorService.execute(runnableTask);
//			
//			executorService.shutdown();

		ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);

	    int count = 0;
		Runnable task1 = () -> {
			System.out.println("Running...task1  : ");
		};

		// init Delay = 5, repeat the task every 1 second
		ScheduledFuture<?> scheduledFuture = ses.scheduleAtFixedRate(task1, 5, 1, TimeUnit.SECONDS);

		while (true) {
			System.out.println("count :" + count);
			Thread.sleep(1000);
			if (count == 5) {
				System.out.println("Count is 5, cancel the scheduledFuture!");
				scheduledFuture.cancel(true);
				ses.shutdown();
				break;
			}
		}

	}

}
