//thread is a light weight subprocess or a path of execution within a program,it can be created or implemented using two methods
//1)extends thread(class) 2)implements runnable(interface)

//life cycle of thread
//1.new(constructing)--starting thread by initializing the obj
    //in the class(extends)
//2.runnable(prepared to execute the code in interface)
//3.running (thread for execution with/without the timeslot)
//4.blocked (in active)
//5.dead/terminated(thread exit at the run() process)

//thread priorities (based on the scenerio)
//1-lowest(Thread.MIN_PRIORITY)
//5-standard(Thread.NORM_PRIORITY)
//10-highest(Thread.MAX_PRIORTY)

package collectionframework;

public class Threadprtc extends Thread{
	
	public void run() {
		for(int i=1;i<=4;i++) {
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
				
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadprtc t1=new Threadprtc();
		Threadprtc t2=new Threadprtc();
		Threadprtc t3=new Threadprtc();
		t1.start();
		try {
			t1.join();
		}catch(Exception e) {
			System.out.println(e);
		}
		t2.start();
		t3.start();

	}

}
