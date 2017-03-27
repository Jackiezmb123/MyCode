package test01;
class startThread implements Runnable{
	public void run(){
		Thread t=Thread.currentThread();
		System.out.println("当前的线程的名字是:"+t.getName());
	}
}
public class getSetThreadName {
public static void main(String[] args) {
	Thread th=new Thread(new startThread());
	th.setName("线程勒，运行勒");
	th.start();
	
}
}
