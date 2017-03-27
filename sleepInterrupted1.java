package test01;

public class sleepInterrupted1 {
public static void main(String[] args) {
	Thread t=Thread.currentThread();
	System.out.println("线程的没被中断："+t.isInterrupted());
	//线程中断
	t.interrupt();
	System.out.println("线程被中断："+t.isInterrupted());
	
	try{
		//线程被中断了，执行休眠，会报中断异常
		t.sleep(20000);
		System.out.println("睡眠");
	}catch(InterruptedException e){
		//线程中断后，清除标志位（true----false）
		System.out.println("线程被中断了，线程退出");
	}
	//中断异常后，会清除标志位
	System.out.println("中断后的中断标志位为："+t.isInterrupted());
}
}
