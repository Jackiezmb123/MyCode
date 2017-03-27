package test01;
class StartThreadDemo extends Thread{
	public void run(){
		for(int i=0;i<4;i++){
			printMsg();
		}
	}
	public void printMsg(){
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("线程的name是"+name);
	}
}
public class threadIsAlive {
public static void main(String[] args) {
	StartThreadDemo std=new StartThreadDemo();
	std.setName("Jackie");
	System.out.println("线程启动之前isAlive:"+std.isAlive());
	
	std.start();
	
	System.out.println("线程启动之后isAlive:"+std.isAlive());
	
	for(int i=0;i<4;i++){
		std.printMsg();
	}
	System.out.println("main方法结束时，线程isAlive："+std.isAlive());
}
}
