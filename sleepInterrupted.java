package test01;

public class sleepInterrupted implements Runnable {
public void run(){
	try{
		System.out.println("此线程被启用！");
		Thread.sleep(10000);
	}catch(InterruptedException e){
		System.out.println("此线程被中断");
		return;
	}
	System.out.println("线程唤醒后，继续执行！");
	System.out.println("线程正常退出！");
}
public static void main(String[] args){
	sleepInterrupted s=new sleepInterrupted();
	Thread t=new Thread(s);
	t.start();
	try{
		Thread.sleep(2000);
	}catch(Exception e){
		e.printStackTrace();
	}
	System.out.println("main线程正在运行");
	
	//interrupted()方法只能中断阻塞的线程，对正在执行的线程不起作用
	t.interrupt();
	System.out.println("main方法正常退出");
}
}
