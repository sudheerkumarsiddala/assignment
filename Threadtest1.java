public class Threadtest1 implements Runnable{

		private String threadName;
			Thread t;
			  Threadtest1(String threadName){
				 this.threadName=threadName;
			}

			@Override
			public void run() {
				System.out.println(threadName+" is running");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(threadName+" is sleeping");
			}

			public void go() {
				t =new Thread(this,threadName);
				t.start();
		}
		} 
