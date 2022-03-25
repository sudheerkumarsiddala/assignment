public class ThreadTest2 {
		public static void main(String args[])
		{
			 Threadtest1 t1=new Threadtest1("thread-1");
				t1.go();
				Threadtest1 t2=new Threadtest1("thread-2");
				t2.go();
				Threadtest1 t3=new Threadtest1("thread-3");
				t3.go();
		}

	}