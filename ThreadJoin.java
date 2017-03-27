package test01;
class ThreadJoinTest implements Runnable{
	public void run(){
		int i=0;
		for(int x=0;x<5;x++){
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			} 
			System.out.println(Thread.currentThread().getName()+"------"+i);
			i+=1;
		}
	}
	
}
public class ThreadJoin {
public static void main(String[] args) {
	Thread t=new Thread(new ThreadJoinTest());
	
	t.start();
	int i=0;
	for(int x=0;x<5;x++){
		if(i==3){
			try{
		//join()方法 线程联合 一般用在主线程里
		//当i=3时，主线程被挂起，执行t线程，直到t线程结束后，再回来执行main线程
		t.join();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		}
		System.out.println("main:"+i);
		i+=1;
		
	}
}
}
