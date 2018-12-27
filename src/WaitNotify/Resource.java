package WaitNotify;
//Wait-Notify使用基本体现生产者消费者模型
public class Resource {
	//当前资源数量
	private int num = 10;
	//资源池中允许存放的资源数目
	private int size = 10;
	
	public synchronized void remove(){
		          if(num > 0){
		              num--;
		              System.out.println("消费者" + Thread.currentThread().getName() +
		                      "消耗一件资源，" + "当前线程池有" + num + "个");
		              notifyAll();//通知生产者生产资源
		          }else{
		              try {
		                  //如果没有资源，则消费者进入等待状态
		                  wait();
		                  System.out.println("消费者" + Thread.currentThread().getName() + "线程进入等待状态");
		              } catch (InterruptedException e) {
		                  e.printStackTrace();
		              }
		          }
		      }
	
	public  synchronized void add() {
		if (num < size) {
			num++;
			System.out.println("生产者" + Thread.currentThread().getName() +
					"生产一件资源" + "当前线程池有" + num + "个");
		}
		else
		{
			try {
				wait();
				System.out.println("生产者" + Thread.currentThread().getName() + "线程进入等待状态");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		//创建资源
		Resource resource = new Resource();
		//消费者资源
		Customer customer = new Customer(resource);
		//生成者资源
		ProducerThread producerThread = new ProducerThread(resource);
		
		customer.start();
		producerThread.start();
	}
}
//线程休眠1000s是不是太长了
class Customer extends Thread
{
	private Resource resource;
	
	public Customer(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		while(true)
		{
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			resource.remove();
		}
		
	}
	
	
}

class ProducerThread extends Thread
{
	private Resource resource;
	public ProducerThread(Resource resource) {
		this.resource = resource;
	}
	@Override
	public void run() {
		
		while(true)
		{
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			resource.add();
		}
	}
	
	
}
