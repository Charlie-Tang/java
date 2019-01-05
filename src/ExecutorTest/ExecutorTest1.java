package ExecutorTest;

import java.util.Date;

public class ExecutorTest1 implements Runnable{
	
	private String command;
	public ExecutorTest1(String s) {
		this.command = s;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"Start.Time="+new Date());
		processCommand();
		System.out.println(Thread.currentThread().getName()+"End.Time="+new Date());
	}

	private void processCommand() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return this.command;
	}
	
}