package ExecutorTest;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/*scheduleAtFixedRate(): 创建并执行在给定的初始延迟之后，随后以给定的时间段首先启用的周期性动作; 
 * 那就是执行将在initialDelay之后开始，然后initialDelay+period ，然后是initialDelay + 2 * period ，等等。
 *  如果任务的执行遇到异常，则后续的执行被抑制。
 *   否则，任务将仅通过取消或终止执行人终止。 
 *   如果任务执行时间比其周期长，则后续执行可能会迟到，但不会同时执行。 
 *   scheduleWithFixedDelay() : 创建并执行在给定的初始延迟之后首先启用的定期动作，随后在一个执行的终止和下一个执行的开始之间给定的延迟。 
 *   如果任务的执行遇到异常，则后续的执行被抑制。 否则，任务将仅通过取消或终止执行终止。
*/
public class ScheduledThreadPoolDemo {
	
	public static void main(String[] args) throws InterruptedException {

		//创建一个ScheduledThreadPoolExecutor对象

		        
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);      
		//计划在某段时间后运行   
		System.out.println("Current Time = "+ new Date());
       
		for(int i=0; i< 3; i++){           
			Thread.sleep(1000);           
			ExecutorTest1 worker = new ExecutorTest1("do heavy processing");
            
			//创建并执行在给定延迟后启用的单次操作。 
			scheduledThreadPool.schedule(worker, 10, TimeUnit.SECONDS);
			//安排任务在初始延迟后运行，然后在给定的时间段内运行。
			scheduledThreadPool.scheduleAtFixedRate(worker, 0, 10, TimeUnit.SECONDS);
		      }

			//添加一些延迟让调度程序产生一些线程    
			Thread.sleep(30000);
			System.out.println("Current Time = "+new Date());       
			//关闭线程池
			scheduledThreadPool.shutdown();
			
			while(!scheduledThreadPool.isTerminated()){
			//等待所有任务完成
		        }
			System.out.println("Finished all threads");
	}
}
