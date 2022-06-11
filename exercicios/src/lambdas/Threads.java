package lambdas;

public class  Threads {
   public static void main(String[] args) {
	   Runnable tarefa01=new Tarefa();
	   //tarefa01.run();
	   
	   Runnable tarefa02=new Runnable() {
			public void run() {
				for(int i=0;i<=10;i++) {
		    		 System.out.println("TAREFA2="+i);
		    		 try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		    	 }
			}
	  };
	  
	  Runnable tarefa03=()->{
		  for(int i=0;i<=10;i++) {
	    		 System.out.println("TAREFA3="+i);
	    		 try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	 }
	  };
	  
	  Thread t1=new Thread(tarefa01);
	  Thread t2=new Thread(tarefa02);
	  Thread t3=new Thread(tarefa03);
	  Runnable tarefa04=Threads::run;
	  Runnable tarefa05=Threads::run;
	  Thread t4=new Thread(tarefa04);
	  Thread t5=new Thread(tarefa05);
	  t1.start();
	  t2.start();
	  t3.start();
	  t4.start();
	  t5.start();   }
   
   public static void run() {
	   for(int i=0;i<=10;i++) {
  		 System.out.println("TAREFA4="+i);
  		 try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  	 }
   }
}
