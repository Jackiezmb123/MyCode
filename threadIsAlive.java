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
		System.out.println("�̵߳�name��"+name);
	}
}
public class threadIsAlive {
public static void main(String[] args) {
	StartThreadDemo std=new StartThreadDemo();
	std.setName("Jackie");
	System.out.println("�߳�����֮ǰisAlive:"+std.isAlive());
	
	std.start();
	
	System.out.println("�߳�����֮��isAlive:"+std.isAlive());
	
	for(int i=0;i<4;i++){
		std.printMsg();
	}
	System.out.println("main��������ʱ���߳�isAlive��"+std.isAlive());
}
}
